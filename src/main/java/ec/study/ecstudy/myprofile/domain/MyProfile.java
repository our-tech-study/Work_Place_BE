package ec.study.ecstudy.myprofile.domain;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "myprofile")
public class MyProfile
{
    @EmbeddedId
    private MyProfileId myProfileId;

    /*
    * (isBasicInfo, requiredYn)
    * 기본 항목 : ('Y', 'Y')
    * 추가 항목
    *   - 고정 항목 : ('Y', 'N')
    *   - 커스텀 항목 : ('N', 'N')
    * */
    private String colVal; // 추가정보 값
    private String useYn; // 사용 여부
    private String isBasicInfo; // 회원가입 시, 기본적으로 저장되는 정보인지 여부
    private String requiredYn; // 필수 정보 여부
}
