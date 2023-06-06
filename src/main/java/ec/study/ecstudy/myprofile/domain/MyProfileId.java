package ec.study.ecstudy.myprofile.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MyProfileId implements Serializable
{
    private String empNo; // 사원번호
    private String colNm; // 추가정보 명칭
}
