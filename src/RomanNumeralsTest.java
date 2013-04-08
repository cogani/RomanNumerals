import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralsTest {

	@Test
	public void I_is_1() {
 		assertEquals(1, new  I().toNumeral()); 
	}
	
	@Test
	public void II_is_2() {
 		assertEquals(2, new  I(new I()).toNumeral()); 
	}
	
	@Test
	public void III_is_3() {
 		assertEquals(3, new I(new  I(new I())).toNumeral()); 
	}
	
	@Test
	public void IV_is_4() {
 		assertEquals(4, new I(new  V()).toNumeral()); 
	}
	
	@Test
	public void V_is_5() {
 		assertEquals(5, new  V().toNumeral()); 
	}
	
	@Test
	public void VI_is_6() {
 		assertEquals(6, new  V(new I()).toNumeral()); 
	}

}
