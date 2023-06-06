package ec.study.ecstudy.service.impl;

import ec.study.ecstudy.data.dto.EmployeeDto;
import ec.study.ecstudy.data.entity.EmployeeEntity;
import ec.study.ecstudy.data.handler.EmployeeDataHandler;
import ec.study.ecstudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDataHandler employeeDataHandler;

    @Autowired
    public EmployeeServiceImpl(EmployeeDataHandler employeeDataHandler){
        this.employeeDataHandler = employeeDataHandler;
    }

    @Override
    public EmployeeDto saveEmployee(String empNo, String pwd, String empNm, String teamCd, String teamLeaderYn, String useYn, String email, String mobile, String jobResponsibility, String extNum) {
        EmployeeEntity employeeEntity = employeeDataHandler.saveEmployeeEntity(empNo, pwd, empNm, teamCd, teamLeaderYn, useYn, email, mobile, jobResponsibility, extNum);

        EmployeeDto employeeDto = new EmployeeDto(employeeEntity.getEmpNo(), employeeEntity.getPwd(), employeeEntity.getEmpNm(), employeeEntity.getTeamCd(), employeeEntity.getTeamLeaderYn(), employeeEntity.getUseYn(), employeeEntity.getEmail(), employeeEntity.getMobile(), employeeEntity.getJobResponsibility(), employeeEntity.getExtNum());
        return employeeDto;
    }

    @Override
    public EmployeeDto getEmployee(String empNo) {
        EmployeeEntity employeeEntity = employeeDataHandler.getEmployeeEntity(empNo);

        EmployeeDto employeeDto = new EmployeeDto(employeeEntity.getEmpNo(), employeeEntity.getPwd(), employeeEntity.getEmpNm(), employeeEntity.getTeamCd(), employeeEntity.getTeamLeaderYn(), employeeEntity.getUseYn(), employeeEntity.getEmail(), employeeEntity.getMobile(), employeeEntity.getJobResponsibility(), employeeEntity.getExtNum());
        return employeeDto;
    }

    @Override
    public void deleteEmployee(String empNo) {
        employeeDataHandler.deleteEmployeeEntity(empNo);
    }

    @Override
    public void updateEmployee(String empNo, EmployeeEntity employeeEntity) throws Exception {
        employeeDataHandler.updateEmployeeEntity(empNo, employeeEntity);
    }
}
