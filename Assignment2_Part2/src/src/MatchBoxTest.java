package src;

import static org.junit.Assert.assertNotEquals;
import junit.framework.TestCase;

public class MatchBoxTest extends TestCase {

	MatchBox box;
	protected void setUp() throws Exception {
		super.setUp();
		box= new MatchBox();
	}
	
	public void testTheVolumeIsCalculated() {
		MatchBox mBox= new MatchBox(1, 1, 1, 1);
		mBox.setVolume();
		assertEquals(1, mBox.getVolume(),0.01);
		assertEquals(mBox.vol, mBox.getVolume(),0.01);
	}
	
	public void testAttributesHaveTheCorrectValues() {
		MatchBox mBox= new MatchBox(1, 2, 3, 4);
		assertEquals(mBox.depth, 3, 0.01);
		assertEquals(mBox.height, 2, 0.01);
		assertEquals(mBox.width, 1, 0.01);
		assertEquals(mBox.weight, 4, 0.01);
	}
	
	public void testStaticDefaultShouldBeZero() {
		assertEquals(MatchBox.result, 0, 0.01);
	}
	
	

}
