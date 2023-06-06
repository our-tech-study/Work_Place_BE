package ec.study.ecstudy.data.dto;

import ec.study.ecstudy.data.entity.EmployeeEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmployeeDto {
    private String empNo;
    private String pwd;
    private String empNm;
    private String teamCd;
    private String teamLeaderYn;
    private String useYn;
    private String email;
    private String mobile;
    private String jobResponsibility;
    private String extNum;

    public EmployeeEntity toEntity() {
        return EmployeeEntity.builder()
                .empNo(empNo)
                .pwd(pwd)
                .empNm(empNm)
                .teamCd(teamCd)
                .teamLeaderYn(teamLeaderYn)
                .useYn(useYn)
                .email(email)
                .mobile(mobile)
                .jobResponsibility(jobResponsibility)
                .extNum(extNum)
                .build();
    }
}
