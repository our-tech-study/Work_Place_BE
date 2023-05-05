package ec.study.ecstudy.employee.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@ApiOperation(value = "사원 컨트롤러" , notes = "사원 관련 컨트롤러")
public class EmployeeController {

    @GetMapping("/all")
    public ResponseEntity<String> all(){
        ResponseEntity<String> response = ResponseEntity.ok("result");

        return response;
    }

    @GetMapping("/{team}")
    public ResponseEntity<String> byTeam(@PathVariable String team){
        ResponseEntity<String> response = ResponseEntity.ok("result");

        return response;
    }

    @GetMapping("/profile/{empNo}")
    @ApiOperation(value = "마이 프로필" , notes = "자신의 프로필 호출하는 API")
    public ResponseEntity<String> profile(@PathVariable String empNo){
        ResponseEntity<String> response = ResponseEntity.ok("result");

        return response;
    }
}
