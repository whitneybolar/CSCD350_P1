package atcsim.loader.navaid;

import atcsim.loader.A_Loader;

//Loads the definition of zero or more fix navaids, creates the corresponding navaids, and adds them to the given navigation overlay. 
public class LoaderFix extends A_Loader{
	
	/*
	//Constructor Creates a fix loader.
	public LoaderFix(java.util.Map<java.lang.String,​A_ComponentNavaid<?>> navaids,OverlayNavigation overlay)
	{
		//Required Parameters
		//    navaids - - the shared collection of navaids
        //    overlay - - the navigation overlay that holds the navaids to be loaded
	}*/


	//Method Loads the fix section of the definition into the overlay.
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
