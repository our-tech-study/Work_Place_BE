package ec.study.ecstudy.setting.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employee")
@Table(name = "employee")
public class Setting { // 사용자정보 테이블
    @Id
    private String empNo; // 사번

}