package backend;

import java.util.ArrayList;
import java.util.List;

public class LagBackend
{
   public String lagNavn;
   public Konkuranse konkurranse;
   public List<Bruker> medlemmer;
   private List<Konkuranse> previousCompetitions;
   
   private Bruker teamLeader;


   LagBackend(String n, Bruker newLeader)
   {
   lagNavn = n;
   konkurranse = null;
   medlemmer = new ArrayList<Bruker>();
   teamLeader = newLeader;
   this.previousCompetitions = new ArrayList<Konkuranse>();
   }

   public LagBackend(String n, Konkuranse k, List<Bruker> m, Bruker newLeader)
   {
       lagNavn = n;
       konkurranse = k;
       medlemmer = m;
       teamLeader = newLeader;
       this.previousCompetitions = new ArrayList<Konkuranse>();
   }

   public void addMember(Bruker b)
   {
       medlemmer.add(b);
   }

   public void removeMember(int index)
   {
       medlemmer.remove(index);
   }
   
   public void removeMember(Bruker bruker) {
	   medlemmer.remove(bruker);
   }

   public String getName()
   {
       return lagNavn;
   }

    public Konkuranse getKonkuranse()
    {
        return konkurranse;
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
        konkurranse = k;
    }
    
    public String toString() {
    	return lagNavn;
    }
    
    public Bruker getLeader() {
    	return teamLeader;
    }
    
    public boolean isLeader(Bruker user) {
    	return user == teamLeader;
    }
    
    public List<Konkuranse> getPreviousCompetitions(){
    	return previousCompetitions;
    }
}
