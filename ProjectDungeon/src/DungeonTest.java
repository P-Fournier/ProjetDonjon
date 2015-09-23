

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DungeonTest {

	protected Dungeon dungeon;
	
	@Before 
	public void createDungeon(){
		dungeon = new Dungeon();
	}
	
	@Test
	public void initialRoomIsEntrance() {
		assertEquals("entrance", dungeon.getCurrentRoom());
	}

	@Test
	public void gameNotFinishedAtBeginning() {
		assertFalse(dungeon.gameIsFinished());
	}

	@Test
	public void nothingHappensWhenGoingInNonExistingDirection() {
		// A COMPLETER
	}
}
