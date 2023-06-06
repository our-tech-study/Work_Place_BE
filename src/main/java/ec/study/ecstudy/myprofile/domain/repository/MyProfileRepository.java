package ec.study.ecstudy.myprofile.domain.repository;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.MyProfileId;
import ec.study.ecstudy.myprofile.query.data.AddableProfileItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyProfileRepository extends JpaRepository<MyProfile, MyProfileId>
{
    @Query(value = "SELECT * FROM myprofile WHERE empNo = :empNo AND useYn = 'Y' ;", nativeQuery = true)
    List<MyProfile> getMyProfile(@Param("empNo") String empNo);

    @Query(value = "SELECT empNo, colNm FROM myprofile WHERE empNo = :empNo AND useYn = 'N' AND requiredYn = 'Y' ;", nativeQuery = true)
    List<AddableProfileItem> getUsableItems(@Param("empNo") String empNo);

    @Query(value = "UPDATE myprofile SET useYn = 'Y' WHERE empNo = :empNo AND colNm = :colNm ;", nativeQuery = true)
    void useItem(@Param("empNo") String empNo, @Param("colNm") String colNm);
}
