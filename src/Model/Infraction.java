package Model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 38 "newModel.ump"
// line 72 "newModel.ump"
public class Infraction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Infraction Attributes
  private boolean isRedCard;
  private boolean isYellowCard;
  private boolean isOther;
  private boolean isPenalty;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Infraction(boolean aIsRedCard, boolean aIsYellowCard, boolean aIsOther, boolean aIsPenalty)
  {
    isRedCard = aIsRedCard;
    isYellowCard = aIsYellowCard;
    isOther = aIsOther;
    isPenalty = aIsPenalty;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setIsRedCard(boolean aIsRedCard)
  {
    boolean wasSet = false;
    isRedCard = aIsRedCard;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsYellowCard(boolean aIsYellowCard)
  {
    boolean wasSet = false;
    isYellowCard = aIsYellowCard;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsOther(boolean aIsOther)
  {
    boolean wasSet = false;
    isOther = aIsOther;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsPenalty(boolean aIsPenalty)
  {
    boolean wasSet = false;
    isPenalty = aIsPenalty;
    wasSet = true;
    return wasSet;
  }

  public boolean getIsRedCard()
  {
    return isRedCard;
  }

  public boolean getIsYellowCard()
  {
    return isYellowCard;
  }

  public boolean getIsOther()
  {
    return isOther;
  }

  public boolean getIsPenalty()
  {
    return isPenalty;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "isRedCard" + ":" + getIsRedCard()+ "," +
            "isYellowCard" + ":" + getIsYellowCard()+ "," +
            "isOther" + ":" + getIsOther()+ "," +
            "isPenalty" + ":" + getIsPenalty()+ "]"
     + outputString;
  }
}