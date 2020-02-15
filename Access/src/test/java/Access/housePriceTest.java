package Access;

import static org.junit.Assert.*;

import org.junit.Test;

public class housePriceTest {
	private static final double DELTA = 1e-15;

	@Test
	public void test() {

		housePrice h=new housePrice();
		double cost=h.totalCost("standard",100.0);
		
		assertEquals(120000.0,cost,DELTA);
	}
	

}
