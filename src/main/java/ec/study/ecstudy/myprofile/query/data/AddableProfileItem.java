package ec.study.ecstudy.myprofile.query.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddableProfileItem {
    private String empNo; // 사원번호
    private String colNm; // 추가정보 명칭
}
