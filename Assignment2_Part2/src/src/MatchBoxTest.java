package src;

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
	}
	
	public void testAttributesHaveTheCorrectValues() {
		MatchBox mBox= new MatchBox(1, 1, 1, 1);
		assertEquals(mBox.depth, 1, 0.01);
		assertEquals(mBox.height, 1, 0.01);
		assertEquals(mBox.width, 1, 0.01);
		assertEquals(mBox.weight, 1, 0.01);
	}
	
	

}
