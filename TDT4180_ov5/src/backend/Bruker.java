package backend;

public class Bruker
{
    public int id;
    public String navn;
    public Konkuranse minKonkuranse;
    public int skritt;

    Bruker(int nyId, String nyttNavn, Konkuranse nyKonkuranse, int nySkritt)
    {
        id = nyId;
        navn = nyttNavn;
        minKonkuranse = nyKonkuranse;
        skritt = nySkritt;
    }

    Bruker(String nyttNavn)
    {
        navn = nyttNavn;
        id = DbFake.nyIdBruker();
    }


}
