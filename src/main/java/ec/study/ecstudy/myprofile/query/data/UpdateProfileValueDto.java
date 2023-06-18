package ec.study.ecstudy.myprofile.query.data;

import ec.study.ecstudy.myprofile.domain.MyProfileId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateProfileValueDto {
    private MyProfileId id;
    private String newValue;
}