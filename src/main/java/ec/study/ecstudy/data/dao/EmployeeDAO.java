package ec.study.ecstudy.data.dao;

import ec.study.ecstudy.data.entity.EmployeeEntity;

public interface EmployeeDAO {
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity getEmployee(String empNo);

    void deleteEmployee(String empNo);

    void updateEmployee(String empNo, EmployeeEntity employeeEntity) throws Exception;
}
