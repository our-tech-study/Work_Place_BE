package ec.study.ecstudy.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    String empNo;
    String pwd;
    String empNm;
    String teamCd;
    String teamLeaderYn;
    String useYn;
    String email;
    String mobile;
    String jobResponsibility;
    String extNum;
    //LONGBLOB;
}
