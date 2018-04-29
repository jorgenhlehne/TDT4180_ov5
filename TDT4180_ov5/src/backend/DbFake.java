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
    	for (int i = 0; i < 5; i++) {
    		LagBackend lag = new LagBackend(noenLagnavn[i], null);
    		teamList.add(lag);
    	}
    }
    
    public List<LagBackend> getTeams() {
    	return teamList;
    }
    
    public List<LagBackend> searchTeams(String searchTerm) {
    	List<LagBackend> returnList = new ArrayList<LagBackend>();
    	for (LagBackend lag : teamList) {
    		String lagnavn = lag.getName();
    		if (lagnavn.toLowerCase().contains(searchTerm.toLowerCase())) {
    			returnList.add(lag);
    		}
    	}
    	return returnList;
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
