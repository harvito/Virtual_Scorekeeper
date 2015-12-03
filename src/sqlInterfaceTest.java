import static org.junit.Assert.*;

import org.junit.Test;

public class sqlInterfaceTest {

	@Test
	public void test() {

		String[] bobStrings = sqlInterface.getPlayerInfo("bob");
		int bobsLength = bobStrings.length;
		int i = 0;
		for (i=0; i<bobsLength; i++) {
			System.out.println(bobStrings[i]);
		}
		fail("Not yet implemented");
	}

}
