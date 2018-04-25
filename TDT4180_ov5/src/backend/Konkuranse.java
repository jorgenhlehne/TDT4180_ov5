package backend;

public class Konkuranse {

    int id;
    String navn;
    int skritt;

    Konkuranse(int nyId, String nyttNavn, int nySkritt)
    {
        id = nyId; navn = nyttNavn; skritt = nySkritt;
    }

    Konkuranse(String nyttNavn)
    {
        navn = nyttNavn;
        id = DbFake.nyIdKonkuranse();
        skritt = 20000;
    }
}
