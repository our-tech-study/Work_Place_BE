package ec.study.ecstudy.team.service;

import ec.study.ecstudy.team.domain.team.Team;
import ec.study.ecstudy.team.domain.team.repository.TeamRepository;
import ec.study.ecstudy.team.domain.team.data.TeamDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamService {
   private final TeamRepository teamRepository;

   @Transactional
    public Team createTeam(TeamDto request){
       Team team = new Team();
       BeanUtils.copyProperties(request, team);
       return teamRepository.save(team);
   }

   public void deleteTeam(Long teamId){
      teamRepository.deleteById(teamId);
   }

   public List<Team> getTeams(){
      // TO-BE: 팀 간 수직 관계 존재 시 관계 컬럼으로 ASC
      return teamRepository.findAll(Sort.by(Sort.Direction.ASC, "teamCd"));
   }

   public Team updateTeam(Long teamCd, TeamDto request){
      Optional<Team> optionalTeam = teamRepository.findById(teamCd);

      Team team = optionalTeam.get();
      team.setTeamNm(request.getTeamNm());
      return teamRepository.save(team);
   }
}
