package ca.hornyelgin.virtualscorekeeper;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 46 "newModel.ump"
// line 77 "newModel.ump"
public class Shot
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Shot Attributes
  private boolean isGoal;
  private boolean isOnTarget;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Shot(boolean aIsGoal, boolean aIsOnTarget)
  {
    isGoal = aIsGoal;
    isOnTarget = aIsOnTarget;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsGoal(boolean aIsGoal)
  {
    boolean wasSet = false;
    isGoal = aIsGoal;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOnTarget(boolean aIsOnTarget)
  {
    boolean wasSet = false;
    isOnTarget = aIsOnTarget;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsGoal()
  {
    return isGoal;
  }

  public boolean getIsOnTarget()
  {
    return isOnTarget;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "isGoal" + ":" + getIsGoal()+ "," +
            "isOnTarget" + ":" + getIsOnTarget()+ "]"
     + outputString;
  }
}