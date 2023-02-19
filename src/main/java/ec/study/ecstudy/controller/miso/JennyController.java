package ec.study.ecstudy.controller.miso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Jenny")
public class JennyController {
    @GetMapping("/hi")
    public String hello(){
        return "Test hi";
    }
}
