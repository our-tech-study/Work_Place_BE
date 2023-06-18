package ec.study.ecstudy.myprofile.controller;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.MyProfileId;
import ec.study.ecstudy.myprofile.query.data.UpdateProfileValueDto;
import ec.study.ecstudy.myprofile.service.MyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/myprofile")
@Transactional
public class MyProfileController {
    private MyProfileService service;

    @Autowired
    public MyProfileController(MyProfileService service)
    {
        this.service = service;
    }

    //http://localhost:8080/myprofile/getUsedItems/{empNo}
    @GetMapping("/getUsedItems/{empNo}") // 1. 활성화된 항목 모두 조회
    public List<MyProfile> getUsedItems(@PathVariable String empNo)
    {
        return service.getUsedItems(empNo);
    }

    //http://localhost:8080/myprofile/getUnusedItems/{empNo}
    @GetMapping("/getUnusedItems/{empNo}") // 2. 비활성화된 고정항목 모두 조회 (e.g. 입사일자/생년월일)
    public List<MyProfile> getUnusedItems(@PathVariable String empNo)
    {
        return service.getUnusedItems(empNo);
    }

    //http://localhost:8080/myprofile/useItem/
    @PostMapping(value = "/useItem/") // 3. 고정 항목 활성화
    public void useItem(@RequestBody MyProfileId id)
    {
        service.useItem(id);
    }

    //http://localhost:8080/myprofile/addNewItem/
    @PostMapping(value = "/addNewItem/")
    public void addNewItem(@RequestBody MyProfile item) // 4. 신규 항목 추가 (= 커스텀 항목 추가) (e.g. 근무지/사무실)
    {
        service.addNewItem(item);
    }

    //http://localhost:8080/myprofile/updateProfileValue/
    @PostMapping(value = "/updateProfileValue/")
    public void updateProfileValue(@RequestBody UpdateProfileValueDto item) // 5. 추가 항목 값 수정
    {
        service.updateProfileValue(item);
    }

    //http://localhost:8080/myprofile/unuseItem/
    @PostMapping(value = "/unuseItem/") // 6. 항목 비활성화 (고정 항목 - 비활성화, 커스텀 항목 - 제거)
    public void unuseItem(@RequestBody MyProfileId id)
    {
        service.unuseItem(id);
    }

    @GetMapping("/test/{str}")
    public String test(@PathVariable String str)
    {
        return str;
    }
}
