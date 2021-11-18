package atcsim.loader.navaid;

public class LoaderFix {
	
	public static void load​(java.util.Scanner scanner) throws java.io.IOException{
		
		System.out.println(scanner);
		
		while(scanner.nextLine() != "[NAVAID:FIX]") {
			System.out.println(scanner.nextLine() + " ");
		}
		if(scanner.nextLine() == "[NAVAID:FIX]") {
		  while(scanner.hasNext()) {
		    	System.out.print(scanner.next());
		      }
		}
	}
}
