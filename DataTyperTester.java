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
		double yaw = 10.0;
		
		AttitudeYaw ay1 = new AttitudeYaw(yaw);
		
		//• -5 + y is correct.
		AttitudeYaw ay1_result = ay1.add_(new AttitudeYaw(-5));
		assertEquals(yaw-5, ay1_result.getValue_());
		
		//• 175 + y is correct.
		ay1_result = ay1.add_(new AttitudeYaw(175.0));
		assertEquals((yaw+175.0)-360.0, ay1_result.getValue_());
		
		//• 5 + y is correct.
		ay1_result = ay1.add_(new AttitudeYaw(5.0));
		assertEquals(yaw+5.0, ay1_result.getValue_());
		
		//• -175 + y is correct.
		ay1_result = ay1.add_(new AttitudeYaw(-175));
		assertEquals((yaw-175), ay1_result.getValue_());
	}
	
	@Test
	public void testCourse() {
		double c = 10.0;
		
		Course cor = new Course(c);
		
		//• 0 + c is correct.
		
		
		//• 355 + c is correct.
		
		
		//• 0 - c is correct.
		
		
		//• 355 - c is correct.
		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testCoordinateWorld() {
		CoordinateWorld p1 = CoordinateWorld.KSFF;
		
		Latitude a1 = new Latitude(1, 2, 3);
		Longitude a2 = new Longitude(3, 2, 1);
		
		CoordinateWorld p2 = new CoordinateWorld(a1, a2);
	   
		String c1 = p1.toString();
	   
	    // p1 = p1
	    assertEquals(0, c1.compareTo(c1));
	    
	    // p1 + p2
	    Latitude m1 = p1.getLatitude();
	    Longitude m2 = p1.getLongitude();
	    
	    Latitude m3 = p2.getLatitude();
	    Longitude m4 = p2.getLongitude();
	    
	    Latitude cm1 = m1.add_(m3);
	    Longitude cm2 = m2.add_(m4);
	    
	    CoordinateWorld p4 = new CoordinateWorld(cm1, cm2);
	    CoordinateWorld p3 = p1.add_(p2);
	    
	    Class<? extends StringBuilder> w1 = p4.dump().getClass();
	    Class<? extends StringBuilder> w2 = p3.dump().getClass();
	    
	    assertEquals(w1, w2);
		
		// fail("Not yet implemented");
	}
	
	@Test
	public void testCoordinateWorld3D() {
		CoordinateWorld p = CoordinateWorld.KSFF;
		CoordinateWorld p1 = CoordinateWorld.KSFF_N;
		CoordinateWorld p2 = CoordinateWorld.KSFF_S;
		CoordinateWorld p3 = CoordinateWorld.KSFF_E;
		CoordinateWorld p4 = CoordinateWorld.KSFF_W;
	
		Altitude a1 = new Altitude();
		
		CoordinateWorld3D c = new CoordinateWorld3D(p, a1);
		CoordinateWorld3D c1 = new CoordinateWorld3D(p1, a1);
		CoordinateWorld3D c2 = new CoordinateWorld3D(p2, a1);
		CoordinateWorld3D c3 = new CoordinateWorld3D(p3, a1);
		CoordinateWorld3D c4 = new CoordinateWorld3D(p4, a1);
		
        CoordinatePolarNavigational3D b = c.calculateBearing3D(c);
        CoordinatePolarNavigational3D b1 = c1.calculateBearing3D(c1);
        CoordinatePolarNavigational3D b2 = c2.calculateBearing3D(c2);
        CoordinatePolarNavigational3D b3 = c3.calculateBearing3D(c3);
        CoordinatePolarNavigational3D b4 = c4.calculateBearing3D(c4);
        
        // p calculateBearing p is correct for angle.
        double result_1 = b.getAngle().getValue_();
        
        assertEquals(b.getAngle().getValue_(), result_1);
        
        // p calculateBearing p is correct for distance.
        double result_2 = b.getRadiusNauticalMiles().getValue_();
   
        assertEquals(b.getRadiusNauticalMiles().getValue_(), result_2);
        
        // p calculateBearing KSFF_N is correct for angle and distance.
        double result_3 = b1.getAngle().getValue_();
        
        assertEquals(b.getAngle().getValue_(), result_3);
        
        double result_4 = b1.getRadiusNauticalMiles().getValue_();
   
        assertEquals(b.getRadiusNauticalMiles().getValue_(), result_4);
        
        // p calculateBearing KSFF_S is correct for angle and distance.
        double result_5 = b2.getAngle().getValue_();
        
        assertEquals(b.getAngle().getValue_(), result_5);
        
        double result_6 = b2.getRadiusNauticalMiles().getValue_();
        
        assertEquals(b.getRadiusNauticalMiles().getValue_(), result_6);
        
        // p calculateBearing KSFF_E is correct for angle and distance.
        double result_7 = b3.getAngle().getValue_();
        
        assertEquals(b.getAngle().getValue_(), result_7);
        
        double result_8 = b3.getRadiusNauticalMiles().getValue_();
        
        assertEquals(b.getRadiusNauticalMiles().getValue_(), result_8);
        
        // p calculateBearing KSFF_W is correct for angle and distance.
        double result_9 = b4.getAngle().getValue_();
        
        assertEquals(b.getAngle().getValue_(), result_9);
        
        double result_10 = b4.getRadiusNauticalMiles().getValue_();
        
        assertEquals(b.getRadiusNauticalMiles().getValue_(), result_10);
        
		// fail("Not yet implemented");
	}

}