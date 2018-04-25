package backend;

public class DbFake {

    static int idBrukerTeller = 0;
    static int idKonkuranseTeller = 0;
    public String[] noenNavn = {"Herp Herp","Ole Nordmann","Kari Hag","Per Hag","Dilbert Dust","Mikkel Rev","Julius Cesar"};
    public String[] noenSteder = {"Månen-sola","bejing-moskva","Oslo-trondheim","sammfundet-hjem","sofaen-kjøleskapet"};
    public String[] noenLagnavn = {"LøpeGutta","LøpeJentene","SprekeFolk","Derp","NeiTilJogging"};

    

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
