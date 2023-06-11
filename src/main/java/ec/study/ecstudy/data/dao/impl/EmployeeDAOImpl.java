package ec.study.ecstudy.data.dao.impl;

import ec.study.ecstudy.data.dao.EmployeeDAO;
import ec.study.ecstudy.data.entity.EmployeeEntity;
import ec.study.ecstudy.data.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {
    EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeDAOImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity){
        employeeRepository.save(employeeEntity);
        return employeeEntity;
    }

    @Override
    public EmployeeEntity getEmployee(String empNo){
        EmployeeEntity employeeEntity = employeeRepository.getById(empNo);
        return employeeEntity;
    }

    @Override
    public void deleteEmployee(String empNo){
        employeeRepository.deleteById(empNo);
    }

    @Override
    public void updateEmployee(String empNo, EmployeeEntity employeeEntity) throws Exception {
        employeeRepository.findById(empNo).orElseThrow(() -> new Exception("Not Existed Employee Code"));
        employeeRepository.save(employeeEntity);
    }
}
