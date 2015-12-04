import static org.junit.Assert.*;

import org.junit.Test;

public class sqlInterfaceTest {


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

}
