package team3;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 26 "model.ump"
// line 56 "model.ump"
public class Shot
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Shot Attributes
  private boolean onGoal;
  private boolean Penalty;
  private boolean Scored;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Shot(boolean aOnGoal, boolean aPenalty, boolean aScored)
  {
    onGoal = aOnGoal;
    Penalty = aPenalty;
    Scored = aScored;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOnGoal(boolean aOnGoal)
  {
    boolean wasSet = false;
    onGoal = aOnGoal;
    wasSet = true;
    return wasSet;
  }

  public boolean setPenalty(boolean aPenalty)
  {
    boolean wasSet = false;
    Penalty = aPenalty;
    wasSet = true;
    return wasSet;
  }

  public boolean setScored(boolean aScored)
  {
    boolean wasSet = false;
    Scored = aScored;
    wasSet = true;
    return wasSet;
  }

  public boolean getOnGoal()
  {
    return onGoal;
  }

  public boolean getPenalty()
  {
    return Penalty;
  }

  public boolean getScored()
  {
    return Scored;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "onGoal" + ":" + getOnGoal()+ "," +
            "Penalty" + ":" + getPenalty()+ "," +
            "Scored" + ":" + getScored()+ "]"
     + outputString;
  }
}