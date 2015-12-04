package team3;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/


import java.util.*;

// line 16 "model.ump"
// line 51 "model.ump"
public class Player
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextPlayerID = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Player Attributes
  private String playerName;
  private int jerseyNumber;
  private boolean GoalKeeper;

  //Autounique Attributes
  private int playerID;

  //Player Associations
  private List<Shot> shots;
  private List<Infraction> infractions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aPlayerName, int aJerseyNumber, boolean aGoalKeeper)
  {
    playerName = aPlayerName;
    jerseyNumber = aJerseyNumber;
    GoalKeeper = aGoalKeeper;
    playerID = nextPlayerID++;
    shots = new ArrayList<Shot>();
    infractions = new ArrayList<Infraction>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setPlayerName(String aPlayerName)
  {
    boolean wasSet = false;
    playerName = aPlayerName;
    wasSet = true;
    return wasSet;
  }

  public boolean setJerseyNumber(int aJerseyNumber)
  {
    boolean wasSet = false;
    jerseyNumber = aJerseyNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setGoalKeeper(boolean aGoalKeeper)
  {
    boolean wasSet = false;
    GoalKeeper = aGoalKeeper;
    wasSet = true;
    return wasSet;
  }

  public String getPlayerName()
  {
    return playerName;
  }

  public int getJerseyNumber()
  {
    return jerseyNumber;
  }

  public boolean getGoalKeeper()
  {
    return GoalKeeper;
  }

  public int getPlayerID()
  {
    return playerID;
  }

  public Shot getShot(int index)
  {
    Shot aShot = shots.get(index);
    return aShot;
  }

  public List<Shot> getShots()
  {
    List<Shot> newShots = Collections.unmodifiableList(shots);
    return newShots;
  }

  public int numberOfShots()
  {
    int number = shots.size();
    return number;
  }

  public boolean hasShots()
  {
    boolean has = shots.size() > 0;
    return has;
  }

  public int indexOfShot(Shot aShot)
  {
    int index = shots.indexOf(aShot);
    return index;
  }

  public Infraction getInfraction(int index)
  {
    Infraction aInfraction = infractions.get(index);
    return aInfraction;
  }

  public List<Infraction> getInfractions()
  {
    List<Infraction> newInfractions = Collections.unmodifiableList(infractions);
    return newInfractions;
  }

  public int numberOfInfractions()
  {
    int number = infractions.size();
    return number;
  }

  public boolean hasInfractions()
  {
    boolean has = infractions.size() > 0;
    return has;
  }

  public int indexOfInfraction(Infraction aInfraction)
  {
    int index = infractions.indexOf(aInfraction);
    return index;
  }

  public static int minimumNumberOfShots()
  {
    return 0;
  }

  public boolean addShot(Shot aShot)
  {
    boolean wasAdded = false;
    if (shots.contains(aShot)) { return false; }
    shots.add(aShot);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeShot(Shot aShot)
  {
    boolean wasRemoved = false;
    if (shots.contains(aShot))
    {
      shots.remove(aShot);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addShotAt(Shot aShot, int index)
  {  
    boolean wasAdded = false;
    if(addShot(aShot))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfShots()) { index = numberOfShots() - 1; }
      shots.remove(aShot);
      shots.add(index, aShot);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveShotAt(Shot aShot, int index)
  {
    boolean wasAdded = false;
    if(shots.contains(aShot))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfShots()) { index = numberOfShots() - 1; }
      shots.remove(aShot);
      shots.add(index, aShot);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addShotAt(aShot, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfInfractions()
  {
    return 0;
  }

  public boolean addInfraction(Infraction aInfraction)
  {
    boolean wasAdded = false;
    if (infractions.contains(aInfraction)) { return false; }
    infractions.add(aInfraction);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeInfraction(Infraction aInfraction)
  {
    boolean wasRemoved = false;
    if (infractions.contains(aInfraction))
    {
      infractions.remove(aInfraction);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addInfractionAt(Infraction aInfraction, int index)
  {  
    boolean wasAdded = false;
    if(addInfraction(aInfraction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInfractions()) { index = numberOfInfractions() - 1; }
      infractions.remove(aInfraction);
      infractions.add(index, aInfraction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInfractionAt(Infraction aInfraction, int index)
  {
    boolean wasAdded = false;
    if(infractions.contains(aInfraction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInfractions()) { index = numberOfInfractions() - 1; }
      infractions.remove(aInfraction);
      infractions.add(index, aInfraction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInfractionAt(aInfraction, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    shots.clear();
    infractions.clear();
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "playerID" + ":" + getPlayerID()+ "," +
            "playerName" + ":" + getPlayerName()+ "," +
            "jerseyNumber" + ":" + getJerseyNumber()+ "," +
            "GoalKeeper" + ":" + getGoalKeeper()+ "]"
     + outputString;
  }
}