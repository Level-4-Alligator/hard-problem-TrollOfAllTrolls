import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RandomNoteTest {
	@Test
	public void testSolveTrue() {
		RansomNote instance = new RansomNote("give me one grand today night", "give one grand today");

		assertTrue(instance.solve());
	}

	@Test
	public void testSolveFalse() {
		RansomNote instance = new RansomNote("give me one grand today night", "give one grand today or else");

		assertFalse(instance.solve());
	}
}
