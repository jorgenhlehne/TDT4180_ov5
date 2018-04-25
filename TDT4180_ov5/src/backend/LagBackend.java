package backend;

import java.util.List;

public class LagBackend
{
   public String lagNavn;
   public Konkuranse konkuranse;
   public List<Bruker> medlemmer;


   LagBackend(String n)
   {
   lagNavn = n;
   }

   LagBackend(String n, Konkuranse k, List<Bruker> m)
   {
       lagNavn = n;
       konkuranse = k;
       medlemmer = m;
   }

   public void addMember(Bruker b)
   {
       medlemmer.add(b);
   }

   public void removeMember(int index)
   {
       medlemmer.remove(index);
   }

   public String getName()
   {
       return lagNavn;
   }

    public Konkuranse getKonkuranse()
    {
        return konkuranse;
    }

    public List<Bruker> getMembers()
    {
        return medlemmer;
    }

    public void setName(String n)
    {
        lagNavn = n;
    }

    public void setKonkuranse(Konkuranse k)
    {
        konkuranse = k;
    }
}
