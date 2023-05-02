package ec.study.ecstudy.controller.test;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/test")
@ApiOperation(value = "테스트 컨트롤러" , notes = "서버 정상동작 확인을 위한 테스트 컨트롤러")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
