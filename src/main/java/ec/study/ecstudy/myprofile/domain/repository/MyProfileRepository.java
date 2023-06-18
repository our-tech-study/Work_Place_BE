package ec.study.ecstudy.myprofile.domain.repository;

import ec.study.ecstudy.myprofile.domain.MyProfile;
import ec.study.ecstudy.myprofile.domain.MyProfileId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyProfileRepository extends JpaRepository<MyProfile, MyProfileId>
{
    // 1. 활성화된 myprofile 항목 리스트 조회 (= 활성화된 항목 모두 조회)
    @Query(value = "SELECT * FROM myprofile WHERE empNo = :empNo AND useYn = 'Y' ;", nativeQuery = true)
    List<MyProfile> getUsedItems(@Param("empNo") String empNo);

    // 2. 추가 가능한 항목 리스트 조회 (= 비활성화된 고정 항목 모두 조회)
    @Query(value = "SELECT * FROM myprofile WHERE empNo = :empNo AND isBasicInfo = 'Y' AND requiredYn = 'N' AND useYn = 'N' ;", nativeQuery = true)
    List<MyProfile> getUnusedItems(@Param("empNo") String empNo);

    // 3. 고정 항목 활성화
    @Modifying // 조회 쿼리가 아님을 나타냄.
    @Query(value = "UPDATE myprofile SET useYn = 'Y' WHERE empNo = :empNo AND colNm = :colNm ;", nativeQuery = true)
    void useItem(@Param("empNo") String empNo, @Param("colNm") String colNm);

    // 5. 추가 항목 값 수정
    @Modifying // 조회 쿼리가 아님을 나타냄.
    @Query(value = "UPDATE myprofile SET colVal = :newValue WHERE empNo = :empNo AND colNm = :colNm ;", nativeQuery = true)
    void updateValue(@Param("empNo") String empNo, @Param("colNm") String colNm, @Param("newValue") String newValue);

    // 6. 고정 항목 비활성화
    @Modifying // 조회 쿼리가 아님을 나타냄.
    @Query(value = "UPDATE myprofile SET useYn = 'N' WHERE empNo = :empNo AND colNm = :colNm ;", nativeQuery = true)
    void unuseItem(@Param("empNo") String empNo, @Param("colNm") String colNm);
}
