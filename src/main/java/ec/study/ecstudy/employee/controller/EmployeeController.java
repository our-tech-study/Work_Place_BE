package ec.study.ecstudy.employee.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@ApiOperation(value = "사원 컨트롤러" , notes = "사원 관련 컨트롤러")
public class EmployeeController {

    @GetMapping("/all")
    public ResponseEntity<String> all(){
        ResponseEntity<String> response = ResponseEntity.ok("ASD");

        return response;
    }
}
