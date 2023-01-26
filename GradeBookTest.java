import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	
	GradeBook gb1, gb2;
	
	@Before
	public void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(1.1);
		gb1.addScore(2.2);
		
		gb2.addScore(3.3);
		gb2.addScore(4.4);
		gb2.addScore(5.5);
	}

	@After
	public void tearDown() throws Exception {
		gb1 = gb2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue("1.1 2.2 0.0 0.0 0.0 ".equals(gb1.toString()));
		assertEquals(2,gb1.getScoreSize());
		
		assertTrue("3.3 4.4 5.5 0.0 0.0 ".equals(gb2.toString()));
		assertEquals(3,gb2.getScoreSize());
		
	}

	@Test
	public void testSum() {
		
		assertEquals(3.3,gb1.sum(), .001);
		
		assertEquals(13.2,gb2.sum(), .001);

	}

	@Test
	public void testMinimum() {
	
		assertEquals(1.1,gb1.minimum(), .001);
		
		assertEquals(3.3 ,gb2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(2.2 ,gb1.finalScore(), .001);
		assertEquals(9.9 ,gb2.finalScore(), .001);
	}


}
