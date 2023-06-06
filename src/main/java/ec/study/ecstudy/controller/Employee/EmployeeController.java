package ec.study.ecstudy.controller.Employee;


import ec.study.ecstudy.data.dto.EmployeeDto;
import ec.study.ecstudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee-api")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired // 자동으로 생성되어 있던 싱글톤 서비스 객체를 끌어다 넣어줌.
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/employee/{empNo}")
    public EmployeeDto getEmployee(@PathVariable String empNo)
    {
        return employeeService.getEmployee(empNo);
    }

    @DeleteMapping(value = "/employee/{empNo}")
    public void deleteEmployee(@PathVariable String empNo) { employeeService.deleteEmployee(empNo); }

    @PutMapping(value = "/employee/{empNo}")
    public void updateEmployee(@PathVariable String empNo, @RequestBody EmployeeDto employeeDto) throws Exception {
        employeeService.updateEmployee(empNo, employeeDto.toEntity());
    }

    @PostMapping(value = "/employee/")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto dto)
    {
        return employeeService.saveEmployee(dto.getEmpNo(), dto.getPwd(), dto.getEmpNm(), dto.getTeamCd(), dto.getTeamLeaderYn(), dto.getUseYn()
                                                                        , dto.getEmail(), dto.getMobile(), dto.getJobResponsibility(), dto.getExtNum());
    }
}
