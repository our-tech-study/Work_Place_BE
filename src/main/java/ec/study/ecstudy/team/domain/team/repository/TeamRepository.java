package ec.study.ecstudy.team.domain.team.repository;

import ec.study.ecstudy.team.domain.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
