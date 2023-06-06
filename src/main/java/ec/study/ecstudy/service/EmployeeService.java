package ec.study.ecstudy.service;

import ec.study.ecstudy.data.dto.EmployeeDto;
import ec.study.ecstudy.data.entity.EmployeeEntity;

public interface EmployeeService {
    EmployeeDto saveEmployee(String empNo, String pwd, String empNm, String teamCd, String teamLeaderYn, String useYn, String email, String mobile, String jobResponsibility, String extNum);
    EmployeeDto getEmployee(String empNo);
    void deleteEmployee(String empNo);
    void updateEmployee(String empNo, EmployeeEntity employeeEntity) throws Exception;
}
