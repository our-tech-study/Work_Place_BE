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

    private String colVal; // 추가정보 값
    private String useYn; // 사용 여부
    private String requiredYn; // 필수 정보 여부
}
