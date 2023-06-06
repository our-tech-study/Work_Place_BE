package ec.study.ecstudy.myprofile.controller;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.MyProfileId;
import ec.study.ecstudy.myprofile.query.data.AddableProfileItem;
import ec.study.ecstudy.myprofile.service.MyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myprofile")
public class MyProfileController {
    private MyProfileService service;

    @Autowired
    public MyProfileController(MyProfileService service)
    {
        this.service = service;
    }

    //http://localhost:8080/myprofile/getMyProfile/{empNo}
    @GetMapping("/getMyProfile/{empNo}") // 활성화 항목 모두 조회
    public List<MyProfile> getMyProfile(@PathVariable String empNo)
    {
        return service.getMyProfile(empNo);
    }

    //http://localhost:8080/myprofile/getUsableItems/{empNo}
    @GetMapping("/getUsableItems/{empNo}") // 비활성화 고정 항목 모두 조회 (e.g. 입사일자/생년월일)
    public List<AddableProfileItem> getUsableItems(@PathVariable String empNo)
    {
        return service.getUsableItems(empNo);
    }

    //http://localhost:8080/myprofile/useFixedItem/
    @PostMapping(value = "/useFixedItem/") // 고정 항목 활성화
    public void useFixedItem(@RequestBody AddableProfileItem item)
    {
        service.useItem(item);
    }

    //http://localhost:8080/myprofile/unuseFixedItem/
    @PostMapping(value = "/unuseFixedItem/") // 고정 항목 비활성화
    public void unuseFixedItem(@RequestBody AddableProfileItem item)
    {
        // todo
    }

    //http://localhost:8080/myprofile/saveCustomItem/
    @PostMapping(value = "/saveCustomItem/")
    public void saveCustomItem(@RequestBody MyProfile item) // 커스텀 항목 추가/수정 (e.g. 근무지/사무실)
    {
        service.saveItem(item);
    }

    //http://localhost:8080/myprofile/deleteItem/
    @PostMapping(value = "/deleteItem/")
    public void deleteCustomItem(@RequestBody MyProfileId id) // 커스텀 항목 삭제
    {
        // todo
    }

    @GetMapping("/test/{str}")
    public String test(@PathVariable String str)
    {
        return str;
    }
}
