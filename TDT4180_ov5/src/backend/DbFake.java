package backend;

import java.util.ArrayList;
import java.util.List;

public class DbFake {

    static int idBrukerTeller = 0;
    static int idKonkuranseTeller = 0;
    public String[] noenNavn = {"Herp Herp","Ole Nordmann","Kari Hag","Per Hag","Dilbert Dust","Mikkel Rev","Julius Caesar"};
    public String[] noenSteder = {"Maanen-sola","Bejing-Moskva","Oslo-Trondheim","Samfundet-hjem","sofaen-kjoeleskapet"};
    public String[] noenLagnavn = {"LoepeGutta","LoepeJentene","SprekeFolk","Derp","NeiTilJogging"};
    
    public Bruker activeUser;
    
    private List<Bruker> userList = new ArrayList<Bruker>(); //En liste med brukere
    private List<LagBackend> teamList = new ArrayList<LagBackend>(); //En liste med lagobjekter
    private List<Konkuranse> compList = new ArrayList<Konkuranse>(); //En liste med konkurranser
    
    public DbFake() {
    	initialize();
    }
    
    public void initialize() {
    	createUsers();
    	populateTeamList();
    	createCompetitions();
    }
    
    //Putter lag i listen over lag
    public void populateTeamList() {
    	for (int i = 0; i < 5; i++) {
    		LagBackend lag = new LagBackend(noenLagnavn[i], userList.get(i));
    		lag.addMember(userList.get(i));
    		teamList.add(lag);
    	}
    }
    
    public void createUsers() {
    	for (int i = 0; i < 5; i++) {
    		Bruker user = new Bruker(i + 2, noenNavn[i], 0);
    		userList.add(user);
    	}
    }
    
    public void createCompetitions() {
    	for (int i = 0; i < 5; i++) {
    		Konkuranse comp = new Konkuranse("Konkurranse " + i);
    		compList.add(comp);
    	}
    }
    
    public List<LagBackend> getTeams() {
    	return teamList;
    }
    
    public List<Bruker> getUsers() {
    	return userList;
    }
    
    public List<Konkuranse> getCompetitions() {
    	return compList;
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
    
    public List<Bruker> searchUsers(String searchTerm) {
    	List<Bruker> returnList = new ArrayList<Bruker>();
    	for (Bruker user : userList) {
    		String brukernavn = user.toString();
    		if (brukernavn.toLowerCase().contains(searchTerm.toLowerCase())) {
    			returnList.add(user);
    		}
    	}
    	return returnList;
    }
    
    public void addTeam(LagBackend newTeam) {
    	teamList.add(newTeam);
    }
    
    public void removeTeam(LagBackend team) {
    	teamList.remove(team);
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
