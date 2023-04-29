package ec.study.ecstudy.data.test.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") // 실제 테이블 이름과 동일
public class ProductEntity {
    //region [fields]
    @Id
    private String id;
    private String name;
    private int price;
    private int stock;
    //endregion
}
