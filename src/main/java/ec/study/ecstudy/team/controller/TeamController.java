package ec.study.ecstudy.team.controller;

import ec.study.ecstudy.team.domain.team.Team;
import ec.study.ecstudy.team.domain.team.data.TeamDto;
import ec.study.ecstudy.team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/team")
@RequiredArgsConstructor
@RestController
public class TeamController {

    private final TeamService teamService;

    @PostMapping()
    public ResponseEntity<Team> createTeam(@RequestBody TeamDto request){
     return ResponseEntity.ok(teamService.createTeam(request));
    }

    @DeleteMapping("/{teamCd}")
    public ResponseEntity<Void> deleteTeam(@PathVariable Long teamCd){
        teamService.deleteTeam(teamCd);
        return  ResponseEntity.ok().build();
    }

    @GetMapping()
    public ResponseEntity<List<Team>> getTeam(){
        return  ResponseEntity.ok(teamService.getTeams());
    }

    @PatchMapping("/{teamCd}")
    public ResponseEntity<Team> deleteTeam(@RequestBody TeamDto request, @PathVariable Long teamCd){;
        return  ResponseEntity.ok(teamService.updateTeam(teamCd, request));
    }
}
