import static org.junit.Assert.*;

import org.junit.Test;

public class sqlInterfaceTest {

	/*
	@Test
	public void test1() {

		String[] bobStrings = sqlInterface.getPlayerInfo("bob");
		int bobsLength = bobStrings.length;
		int i = 0;
		for (i=0; i<bobsLength; i++) {
			System.out.println(bobStrings[i]);
		}
		fail("Not yet implemented");
	}
		*/
	/*
	@Test
	public void test2() {
		
		sqlInterface.addPlayer("bob1", "70", "10", "100", "2", "filthyDogs");
		String[] bobStrings = sqlInterface.getPlayerInfo("bob1");
		int bobsLength = bobStrings.length;
		int i = 0;
		for (i=0; i<bobsLength; i++) {
			System.out.println(bobStrings[i]);
		}
		fail("nope");
	}

	@Test
	public void test3() {
		
		sqlInterface.removePlayer("bob1");

		fail("nope");
	}
		*/
	@Test
	public void test4() {

		
		String[][] playerInfo = new String[20][6];
		playerInfo = sqlInterface.getTeamsFullPlayerInfo("all");
		int playerLength = playerInfo.length;
		int i = 0;
		for (i=0; i<playerLength; i++) {
			System.out.println(playerInfo[i][0] + "," + 
								playerInfo[i][1] + "," + 
								playerInfo[i][2] + "," +
								playerInfo[i][3] + "," + 
								playerInfo[i][4] + "," + 
								playerInfo[i][5]);

		}
		
		fail("nope");
	}

}
