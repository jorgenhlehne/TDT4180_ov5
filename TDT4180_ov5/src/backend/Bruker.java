package backend;

import java.util.ArrayList;
import java.util.List;

public class Bruker
{
    public int id;
    public String navn;
    public Konkuranse individualCompetition, teamCompetition;
    private List<LagBackend> teamList;
    public int skritt;

    public Bruker(int nyId, String nyttNavn, int nySkritt)
    {
        id = nyId;
        navn = nyttNavn;
        individualCompetition = null;
        teamCompetition = null;
        skritt = nySkritt;
        teamList = new ArrayList<LagBackend>();
    }
    
    public void joinIndividualCompetition(Konkuranse konkurranse) {
    	this.individualCompetition = konkurranse;
    }
    
    public void joinTeamCompetition(Konkuranse konkurranse) {
    	this.teamCompetition = konkurranse;
    }

    Bruker(String nyttNavn)
    {
        navn = nyttNavn;
        id = DbFake.nyIdBruker();
    }


}
