package backend;

import java.util.ArrayList;
import java.util.List;

public class Bruker
{
    public int id;
    public String navn;
    public Konkuranse individualCompetition, teamCompetition;
    private List<LagBackend> teamListMember; //Lag man er medlem av
    private List<LagBackend> teamListAdmin; //Lag man er admin for
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
    
    public List<LagBackend> getTeams() {
    	return teamListMember;
    }
    
    public void joinIndividualCompetition(Konkuranse konkurranse) {
    	this.individualCompetition = konkurranse;
    }
    
    public void joinTeamCompetition(Konkuranse konkurranse) {
    	this.teamCompetition = konkurranse;
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
