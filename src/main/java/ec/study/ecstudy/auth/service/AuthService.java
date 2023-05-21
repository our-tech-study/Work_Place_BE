package ec.study.ecstudy.auth.service;
import ec.study.ecstudy.auth.service.request.SignInRequest;
import ec.study.ecstudy.auth.service.response.AuthResponse;
import ec.study.ecstudy.auth.service.response.SignInResponse;
import ec.study.ecstudy.employee.domain.Employee;
import ec.study.ecstudy.employee.domain.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private EmployeeRepository employeeRepository; //bean, singleton
    @Autowired //DI
    public AuthService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }
    public AuthResponse signIn(SignInRequest signInReq){

        boolean existed = employeeRepository.existsByEmpNoAndPwd(signInReq.getEmpNo(), signInReq.getPwd());

        //System.out.println("AuthService : " + existed);

        // fail
        if(!existed){
            return new AuthResponse(false,"로그인 정보를 확인해주세요",null);
        }

        // success
        Employee emp = employeeRepository.findById(signInReq.getEmpNo()).get();
        emp.setPwd("");

        // return value
        String token = "";
        int exprTime = 3600000;
        SignInResponse signInRes = new SignInResponse(token, exprTime, emp);

        // return setting
        return new AuthResponse(true,"로그인 성공",signInRes);
    }
}
