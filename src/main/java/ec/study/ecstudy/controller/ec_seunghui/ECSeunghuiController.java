package ec.study.ecstudy.controller.ec_seunghui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ec_seunghui")
public class ECSeunghuiController {

    @GetMapping("/hello")
    public String hello(){
        return "Hi Seunghui!";
    }
}
