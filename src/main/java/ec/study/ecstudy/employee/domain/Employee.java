package ec.study.ecstudy.employee.domain;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employee")
@Table(name = "employee")
public class Employee { // 사용자정보 테이블
    @Id
    private String empNo; // 사번
    private String pwd; // 비밀번호
    private String empNm; // 사원명
    private String teamCd; // 팀코드
    private String teamLeaderYn; // 팀리더여부
    private String useYn; // 사용여부 : 재직중 Y, 퇴사 N
    private String email; // 이메일
    private String mobile; // 모바일
    private String jobResponsibility; // jobResponsibility 팀장, 본부장 등 직책
    private String extNum; // 내선번호
    private String image; // 프로필이미지
}