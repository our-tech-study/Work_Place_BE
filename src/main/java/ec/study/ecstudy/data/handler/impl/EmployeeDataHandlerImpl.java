package ec.study.ecstudy.data.handler.impl;

import ec.study.ecstudy.data.dao.EmployeeDAO;
import ec.study.ecstudy.data.entity.EmployeeEntity;
import ec.study.ecstudy.data.handler.EmployeeDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeDataHandlerImpl implements EmployeeDataHandler {
    EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeDataHandlerImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public EmployeeEntity saveEmployeeEntity(String empNo, String pwd, String empNm, String teamCd, String teamLeaderYn, String useYn, String email, String mobile, String jobResponsibility, String extNum) {
        EmployeeEntity employeeEntity = new EmployeeEntity(empNo, pwd, empNm, teamCd, teamLeaderYn, useYn, email, mobile, jobResponsibility, extNum);

        return employeeDAO.saveEmployee(employeeEntity);
    }

    @Override
    public EmployeeEntity getEmployeeEntity(String empNo) {
        return employeeDAO.getEmployee(empNo);
    }

    @Override
    public void deleteEmployeeEntity(String empNo) {
        employeeDAO.deleteEmployee(empNo);
    }

    @Override
    public void updateEmployeeEntity(String empNo, EmployeeEntity employeeEntity) throws Exception {
        employeeDAO.updateEmployee(empNo, employeeEntity);
    }
}
