/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 33 "model.ump"
// line 61 "model.ump"
public class Infraction
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Infraction Attributes
  private boolean RedCard;
  private boolean YellowCard;
  private boolean otherInfraction;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Infraction(boolean aRedCard, boolean aYellowCard, boolean aOtherInfraction)
  {
    RedCard = aRedCard;
    YellowCard = aYellowCard;
    otherInfraction = aOtherInfraction;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRedCard(boolean aRedCard)
  {
    boolean wasSet = false;
    RedCard = aRedCard;
    wasSet = true;
    return wasSet;
  }

  public boolean setYellowCard(boolean aYellowCard)
  {
    boolean wasSet = false;
    YellowCard = aYellowCard;
    wasSet = true;
    return wasSet;
  }

  public boolean setOtherInfraction(boolean aOtherInfraction)
  {
    boolean wasSet = false;
    otherInfraction = aOtherInfraction;
    wasSet = true;
    return wasSet;
  }

  public boolean getRedCard()
  {
    return RedCard;
  }

  public boolean getYellowCard()
  {
    return YellowCard;
  }

  public boolean getOtherInfraction()
  {
    return otherInfraction;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "RedCard" + ":" + getRedCard()+ "," +
            "YellowCard" + ":" + getYellowCard()+ "," +
            "otherInfraction" + ":" + getOtherInfraction()+ "]"
     + outputString;
  }
}