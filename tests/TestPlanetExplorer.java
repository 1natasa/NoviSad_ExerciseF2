import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testProveraDaLiOdeNapredJednom()
	{
		PlanetExplorer planeta = new PlanetExplorer(3, 3, "(0,2)");
		String putanja ="f";
		String pozicija=planeta.executeCommand(putanja);
		assertEquals("(0,1)",pozicija);
		
		//String expectedCoordinates= ":(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(50) +
			//	"," + Integer.toString(startCoordinates[2])+")";
		
		
	}
}
