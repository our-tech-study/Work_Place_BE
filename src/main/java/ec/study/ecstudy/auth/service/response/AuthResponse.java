package ec.study.ecstudy.auth.service.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private boolean result;
    private String message;
    private SignInResponse signInRes;
}
