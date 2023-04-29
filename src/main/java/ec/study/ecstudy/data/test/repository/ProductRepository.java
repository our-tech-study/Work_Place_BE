package ec.study.ecstudy.data.test.repository;

import ec.study.ecstudy.data.test.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository를 상속받는 것만으로도 기본적인 crud 기능을 사용 가능.
public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
