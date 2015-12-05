package TestPersistence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Model.Infraction;
import Model.Manager;
import Model.Player;
import Model.Shot;
import Model.Team;
import Persistence.XStreamPersistence;

public class TestPersistence {

	//FORGOT TO TEST MATCH REMEMBER TO ADD BEFORE SUBMITTING
	
	@Before
	public void setUp() throws Exception
	{
		//Create Manager, Team and two players
		Manager manager = Manager.getInstance();
		Team teamone = new Team("Barca",0);
		Player playerone = new Player("messi",10,160,160,teamone);
		Player playertwo = new Player("neymar",10,160,160,teamone);
		teamone.addPlayer(playerone);
		teamone.addPlayer(playertwo);

		//Add team to manager
		manager.addTeam(teamone);
		
		//Create an add shots to player
		Shot shotone= new Shot(true,true);
		Shot shottwo = new Shot(false,true);
		playerone.addShot(shotone);
		playertwo.addShot(shottwo);
		
		//Create and add infractions to players
		Infraction red = new Infraction(true,false,false,false);
		Infraction yellow = new Infraction(false,true,false,false);
		playerone.addInfraction(red);
		playertwo.addInfraction(yellow);
	}

	@After
	public void tearDown() throws Exception 
	{
		Manager manager = Manager.getInstance();
		manager.delete();
	}

	@Test
	public void test() 
	{
		//Save model
		Manager manager = Manager.getInstance();
		
		XStreamPersistence.setFilename("src\\TestPersistence\\test.xml");
		XStreamPersistence.setAlias("Team",Team.class);
		XStreamPersistence.setAlias("Player",Player.class);
		XStreamPersistence.setAlias("Shot",Shot.class);
		XStreamPersistence.setAlias("Infraction",Infraction.class);
		XStreamPersistence.setAlias("Manager",Manager.class);

		if(!XStreamPersistence.saveToXMLwithXStream(manager))
		{
			fail("Could not save to file");
		}
		
		//Clear the model in memory
		manager.delete();
		assertEquals(0,manager.getTeams().size());
		
		//Load model
		manager=(Manager)XStreamPersistence.loadFromXMLwithXStream();
		if(manager==null)
		{
			fail("Could not load file");
		}
		
		//Check
		assertEquals(1,manager.getTeams().size());
		assertEquals("Barca",manager.getTeam(0).getName());
		assertEquals(2,manager.getTeam(0).getPlayers().size());
		assertEquals("messi",manager.getTeam(0).getPlayer(0).getName());
		assertEquals("neymar",manager.getTeam(0).getPlayer(1).getName());
		assertEquals(10,manager.getTeam(0).getPlayer(1).getJerseyNumber());
		assertEquals(10,manager.getTeam(0).getPlayer(0).getJerseyNumber());
		assertEquals(160,manager.getTeam(0).getPlayer(1).getHeight());
		assertEquals(160,manager.getTeam(0).getPlayer(0).getHeight());
		assertEquals(160,manager.getTeam(0).getPlayer(1).getWeight());
		assertEquals(160,manager.getTeam(0).getPlayer(0).getWeight());
		
		assertEquals(1,manager.getTeam(0).getPlayer(0).getShots().size());
		assertEquals(1,manager.getTeam(0).getPlayer(1).getShots().size());
		assertEquals(1,manager.getTeam(0).getPlayer(0).getInfractions().size());
		assertEquals(1,manager.getTeam(0).getPlayer(1).getInfractions().size());
		
		assertEquals(true,manager.getTeam(0).getPlayer(0).getInfraction(0).getIsRedCard());
		assertEquals(false,manager.getTeam(0).getPlayer(0).getInfraction(0).getIsYellowCard());
		assertEquals(false,manager.getTeam(0).getPlayer(0).getInfraction(0).getIsOther());
		assertEquals(false,manager.getTeam(0).getPlayer(0).getInfraction(0).getIsPenalty());
		assertEquals(true,manager.getTeam(0).getPlayer(1).getInfraction(0).getIsYellowCard());
		assertEquals(false,manager.getTeam(0).getPlayer(1).getInfraction(0).getIsRedCard());
		assertEquals(false,manager.getTeam(0).getPlayer(1).getInfraction(0).getIsOther());
		assertEquals(false,manager.getTeam(0).getPlayer(1).getInfraction(0).getIsPenalty());
		
		assertEquals(true,manager.getTeam(0).getPlayer(0).getShot(0).getIsGoal());
		assertEquals(true,manager.getTeam(0).getPlayer(0).getShot(0).getIsOnTarget());
		assertEquals(false,manager.getTeam(0).getPlayer(1).getShot(0).getIsGoal());
		assertEquals(true,manager.getTeam(0).getPlayer(1).getShot(0).getIsOnTarget());	
	}

}
