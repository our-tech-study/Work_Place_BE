package ec.study.ecstudy.employee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Employee {

    @Id
    private String empNo;

    @NonNull
    private String pwd;
    @NonNull
    private String empNm;
    @NonNull
    private String teamCd;
    @NonNull
    private String teamLeaderYn;
    @NonNull
    private String useYn;

}
