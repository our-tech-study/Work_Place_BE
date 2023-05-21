package ec.study.ecstudy.auth.service.response;

import ec.study.ecstudy.employee.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInResponse {
    private String token;
    private int exprTime;
    private Employee employee;
}
