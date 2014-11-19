package test;

import src.Power;
import junit.framework.TestCase;

public class PowerTest extends TestCase {

	public void testIfRightIsZeroResultIsOne() {
		assertEquals(1, Power.power(-5, 0));
	}
	
	public void testIfLeftIsZeroResultIsZero() {
		assertEquals(0, Power.power(0, 12));
	}
	
	public void testIfRightEqualsToOneThenResultEqualLeft() {
		assertEquals(3, Power.power(3, 1));
	}
	
	public void testPostConditionIsVerified() {
		assertEquals(27, Power.power(3, 3));
	}
	
	public void testPostConditionIsVerified2() {
		assertEquals(9, Power.power(3, 2));
	}
	

}
