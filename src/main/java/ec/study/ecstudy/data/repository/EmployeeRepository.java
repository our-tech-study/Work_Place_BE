package ec.study.ecstudy.data.repository;

import ec.study.ecstudy.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
}
