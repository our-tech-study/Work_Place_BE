package ec.study.ecstudy.auth.service.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// For SignIn Dto
// build gradle add implementation 'org.springframework.boot:spring-boot-starter-validation:'
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInRequest {
    private String empNo; // 사번
    private String pwd;
}
