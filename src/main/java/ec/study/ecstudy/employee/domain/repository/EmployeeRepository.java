package ec.study.ecstudy.employee.domain.repository;
import ec.study.ecstudy.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // include @Component, dependencies.
public interface EmployeeRepository extends JpaRepository<Employee, String> { // 1. entity, 2. pk type
    public boolean existsByEmpNoAndPwd(String empNo, String pwd);
}