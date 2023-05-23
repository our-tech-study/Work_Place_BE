package ec.study.ecstudy.setting.domain.repository;
import ec.study.ecstudy.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Employee, String> {

}