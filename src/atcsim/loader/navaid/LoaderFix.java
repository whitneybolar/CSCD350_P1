package atcsim.loader.navaid;

public class LoaderFix {
	
	public void load​(java.util.Scanner scanner) throws java.io.IOException{
		
		System.out.println("Whitney's code");
		
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
