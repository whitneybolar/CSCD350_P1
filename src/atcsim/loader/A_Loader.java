package atcsim.loader;

import java.io.IOException;
import java.util.Scanner;

public abstract class A_Loader extends java.lang.Object{
	
	protected static String id; 
	
	// !!! read the ID based on the name of the list 
	// Specify what item in next() is an int or a double!!!!
	public static String ReadID(Scanner scanner) {
		if(scanner.hasNext()) {
	    	scanner.next();
	    	String id = scanner.next();
	    	return id; 
	    }
		else {
			return null;
		}
	}
	
	public static String ReadLatitude(Scanner scanner) throws IOException {
		while(scanner.hasNext()) {
				String ft = scanner.next();
				return ft;
        }
		return null;
}
	
	public static String ReadLongitude(Scanner scanner) throws IOException {
		while(scanner.hasNext()) {
				String ft = scanner.next();
				return ft;
        }
		return null;
}
	public static String ReadAltitude(Scanner scanner) throws IOException {
		while(scanner.hasNext()) {
				String ft = scanner.next();
				return ft;
			}
		return null;
      }
}