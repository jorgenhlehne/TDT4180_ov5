package backend;

import java.util.ArrayList;
import java.util.List;

public class DbFake {

    static int idBrukerTeller = 0;
    static int idKonkuranseTeller = 0;
    public String[] noenNavn = {"Herp Herp","Ole Nordmann","Kari Hag","Per Hag","Dilbert Dust","Mikkel Rev","Julius Caesar"};
    public String[] noenSteder = {"Maanen-sola","Bejing-Moskva","Oslo-Trondheim","Samfundet-hjem","sofaen-kjoeleskapet"};
    public String[] noenLagnavn = {"LoepeGutta","LoepeJentene","SprekeFolk","Derp","NeiTilJogging"};
    
    private List<LagBackend> teamList = new ArrayList<LagBackend>(); //En liste med lagobjekter
    
    public DbFake() {
    	initialize();
    }
    
    public void initialize() {
    	populateTeamList();
    }
    
    //Putter lag i listen over lag
    public void populateTeamList() {
    	LagBackend lag1 = new LagBackend(noenLagnavn[1], null);
        LagBackend lag2 = new LagBackend(noenLagnavn[2], null);
        LagBackend lag3 = new LagBackend(noenLagnavn[3], null);
        teamList.add(lag1);
        teamList.add(lag2);
        teamList.add(lag3);
    }
    
    public List<LagBackend> getTeams() {
    	return teamList;
    }
    
    public void addTeam(LagBackend newTeam) {
    	teamList.add(newTeam);
    }

    static public int nyIdBruker()
    {
        idBrukerTeller++;
        return idBrukerTeller;
    }

    static public int nyIdKonkuranse()
    {
        idKonkuranseTeller++;
        return idBrukerTeller;
    }
}
