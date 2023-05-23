package ec.study.ecstudy.setting.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/setting")
@ApiOperation(value = "설정 컨트롤러" , notes = "설정 관련 컨트롤러")
public class SettingController {

    @GetMapping("/list")
    public ResponseEntity<String> list(){
        ResponseEntity<String> response = ResponseEntity.ok("temp");

        return response;
    }
}
