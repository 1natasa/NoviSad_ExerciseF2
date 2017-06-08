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
		assertEquals("(0,1,N)",pozicija);
		
		//String expectedCoordinates= ":(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(50) +
			//	"," + Integer.toString(startCoordinates[2])+")";	
	}
	
	@Test
	public void testProveraDaLiIdeNazadZaJedan()
	{
		PlanetExplorer planeta = new PlanetExplorer(3, 3, "(0,2)");
		
		planeta.setxKo(0);
		planeta.setyKo(1);
		
		String putanja="b";
		String pozicija=planeta.executeCommand(putanja);
		assertEquals("(0,0,S)", pozicija);
		
	}
	
	@Test 
	public void testProveraDaLiIdeDesnoZaJedan()
	{
		PlanetExplorer planeta = new PlanetExplorer(3, 3, "(0,2)");
		
		planeta.setxKo(0);
		planeta.setyKo(0);
		
		String putanja="r";
		
		String pozicija=planeta.executeCommand(putanja);
		assertEquals("(1,0,E)", pozicija);
	}
	
}
