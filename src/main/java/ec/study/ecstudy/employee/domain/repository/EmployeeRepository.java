package ec.study.ecstudy.employee.domain.repository;

import ec.study.ecstudy.data.test.entity.ProductEntity;
import ec.study.ecstudy.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
