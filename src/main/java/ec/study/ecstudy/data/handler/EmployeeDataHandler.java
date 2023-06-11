package ec.study.ecstudy.data.handler;

import ec.study.ecstudy.data.entity.EmployeeEntity;

public interface EmployeeDataHandler {
    EmployeeEntity saveEmployeeEntity(String empNo, String pwd, String empNm, String teamCd, String teamLeaderYn, String useYn, String email, String mobile, String jobResponsibility, String extNum);

    EmployeeEntity getEmployeeEntity(String empNo);

    void deleteEmployeeEntity(String empNo);

    void updateEmployeeEntity(String empNo, EmployeeEntity employeeEntity) throws Exception;
}
