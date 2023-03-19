package ec.study.ecstudy.controller.surinTest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/surin")
public class SurinTestController {
    @GetMapping("/test")
   public String surinTest(){
       return "Hello! Surin Test!";
    }
}
