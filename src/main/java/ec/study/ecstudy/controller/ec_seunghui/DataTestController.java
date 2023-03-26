package ec.study.ecstudy.controller.ec_seunghui;

import ec.study.ecstudy.service.ec_seunghui.DataTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ec_dataTest")
public class DataTestController {
    @Autowired
    private DataTestService dataTestService;

    @GetMapping("/dataTest")
    public String hello(){
        return dataTestService.getValue();
    }
}
