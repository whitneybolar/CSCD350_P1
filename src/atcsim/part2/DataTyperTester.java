package atcsim.part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import atcsim.datatype.*;

class DataTyperTester {

	@Test
	public void testAltitude() {
		double v1 = 1000;
		double v2 = 200;
		
		Altitude a1 = new Altitude(v1);
		Altitude a2 = new Altitude(v2);
		assertEquals(v1, a1.getValue_());
		assertEquals(v2, a2.getValue_());
		
		// a1 + a2
		Altitude a3 = a1.add_(a2);
		assertEquals(a1.getValue_()+a2.getValue_(), a3.getValue_());
		
		// a2 + a1
		a3 = a2.add_(a1);
		assertEquals(a2.getValue_()+a1.getValue_(),a3.getValue_());
		
		// a1 - a2
		a3 = a1.subtract_(a2);
		assertEquals(a1.getValue_()-a2.getValue_(),a3.getValue_());
		
		// a2 - a1
		a3 = a2.subtract_(a1);
		assertEquals(a2.getValue_()-a1.getValue_(),a3.getValue_());
	    
		// a1 = a1
		assertEquals(0, a1.compareTo(a1));
		
		// a1 > a2
		assertEquals(1, a1.compareTo(a2));
		
		// a2 < a1
		assertEquals(-1, a2.compareTo(a1));
	}
	
	@Test
	public void testAngleNavigational() {
		double v1 = 90.0;
		double v2 = 180.0;
		
		AngleNavigational a1 = new AngleNavigational(v1);
		
		// a1 reciprocate
		AngleNavigational a3 = a1.reciprocate();
		assertEquals(270.0, a3.getValue_());
		
		// a2 reciprocate
		AngleNavigational a2 = new AngleNavigational(v2);
		a3 = a2.reciprocate();
		assertEquals(0.0, a3.getValue_());
		
		// a1 interpolate a2 using 50% scaler
		a3 = a1.interpolate(a2, Scaler.HALF);
		assertEquals(135.0, a3.getValue_());
		
		// a2 interpolate a1 using 50% scaler
		a3 = a2.interpolate(a1, Scaler.HALF);
		assertEquals(315.0, a3.getValue_());
	}
	
	@Test
	public void testAttitudePitch() {
		double value = 10.0;
		AttitudePitch p = new AttitudePitch(value);
		
		// 0 + p
		AttitudePitch p_result = p.add_(new AttitudePitch(0.0));
		assertEquals(value, p_result.getValue_());
		
		// 90 + p
		p_result = p.add_(new AttitudePitch(90.0));
		assertEquals(value+90.0, p_result.getValue_());
		System.out.println(p_result);
		
		// 175 + p 
		p_result = p.add_(new AttitudePitch(175.0));
		assertEquals((value+175.0)-360.0, p_result.getValue_());
	}
	
	@Test
	public void testAttitudeYaw() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCourse() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCoordinateWorld() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCoordinateWorld3D() {
		fail("Not yet implemented");
	}

}
