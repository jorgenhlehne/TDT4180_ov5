package backend;

import java.util.ArrayList;
import java.util.List;

public class Bruker
{
    public int id;
    public String navn;
    public Konkuranse individualCompetition, teamCompetition;
    private List<LagBackend> teamListMember; //Lag man er medlem av
    private List<LagBackend> teamListAdmin; //Brukes ikke
    public int skritt;

    public Bruker(int nyId, String nyttNavn, int nySkritt)
    {
        id = nyId;
        navn = nyttNavn;
        individualCompetition = null;
        teamCompetition = null;
        skritt = nySkritt;
        teamListMember = new ArrayList<LagBackend>();
        teamListAdmin = new ArrayList<LagBackend>();
    }
    
    public void joinTeam(LagBackend newTeam) {
    	this.teamListMember.add(newTeam);
    }
    
    public void leaveTeam(LagBackend team) {
    	this.teamListMember.remove(team);
    }
    
    public List<LagBackend> getTeams() {
    	return teamListMember;
    }
    
    public void joinIndividualCompetition(Konkuranse konkurranse) {
    	this.individualCompetition = konkurranse;
    }
    
    public void leaveIndividualCompetition() {
    	this.individualCompetition = null;
    }
    
    public void joinTeamCompetition(Konkuranse konkurranse) {
    	this.teamCompetition = konkurranse;
    }
    
    public void leaveTeamCompetition() {
    	this.teamCompetition = null;
    }
    
    public String toString() {
    	return navn;
    }

    Bruker(String nyttNavn)
    {
        navn = nyttNavn;
        id = DbFake.nyIdBruker();
    }


}
