package team3;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/


import java.sql.Date;
import java.util.*;

// line 1 "model.ump"
// line 41 "model.ump"
public class Match
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextMacthID = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Match Attributes
  private String location;
  private Date date;

  //Autounique Attributes
  private int macthID;

  //Match Associations
  private List<Team> teams;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Match(String aLocation, Date aDate, Team... allTeams)
  {
    location = aLocation;
    date = aDate;
    macthID = nextMacthID++;
    teams = new ArrayList<Team>();
    boolean didAddTeams = setTeams(allTeams);
    if (!didAddTeams)
    {
      throw new RuntimeException("Unable to create Match, must have 2 teams");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLocation(String aLocation)
  {
    boolean wasSet = false;
    location = aLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(Date aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public String getLocation()
  {
    return location;
  }

  public Date getDate()
  {
    return date;
  }

  public int getMacthID()
  {
    return macthID;
  }

  public Team getTeam(int index)
  {
    Team aTeam = teams.get(index);
    return aTeam;
  }

  public List<Team> getTeams()
  {
    List<Team> newTeams = Collections.unmodifiableList(teams);
    return newTeams;
  }

  public int numberOfTeams()
  {
    int number = teams.size();
    return number;
  }

  public boolean hasTeams()
  {
    boolean has = teams.size() > 0;
    return has;
  }

  public int indexOfTeam(Team aTeam)
  {
    int index = teams.indexOf(aTeam);
    return index;
  }

  public static int requiredNumberOfTeams()
  {
    return 2;
  }

  public static int minimumNumberOfTeams()
  {
    return 2;
  }

  public static int maximumNumberOfTeams()
  {
    return 2;
  }

  public boolean setTeams(Team... newTeams)
  {
    boolean wasSet = false;
    ArrayList<Team> verifiedTeams = new ArrayList<Team>();
    for (Team aTeam : newTeams)
    {
      if (verifiedTeams.contains(aTeam))
      {
        continue;
      }
      verifiedTeams.add(aTeam);
    }

    if (verifiedTeams.size() != newTeams.length || verifiedTeams.size() != requiredNumberOfTeams())
    {
      return wasSet;
    }

    teams.clear();
    teams.addAll(verifiedTeams);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    teams.clear();
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "macthID" + ":" + getMacthID()+ "," +
            "location" + ":" + getLocation()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }
}