package ec.study.ecstudy.auth.controller;
import ec.study.ecstudy.auth.service.AuthService;
import ec.study.ecstudy.auth.service.request.SignInRequest;
import ec.study.ecstudy.auth.service.response.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// for signIn, signUp
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService)
    {
        this.authService = authService;
    }

    @PostMapping(value = "/signIn")
    public ResponseEntity<AuthResponse> signIn(@RequestBody SignInRequest reqBody){
        //System.out.println("AuthController : " + reqBody);
        return ResponseEntity.ok().body(authService.signIn(reqBody));
    }
}
