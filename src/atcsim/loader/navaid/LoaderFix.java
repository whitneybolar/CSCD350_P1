package atcsim.loader.navaid;

import java.util.ArrayList;
import java.util.Scanner;

import atcsim.loader.A_Loader;

public class LoaderFix extends A_Loader{
	
	protected String id; 
	
	/*
	//Constructor Creates a fix loader.
	public LoaderFix(java.util.Map<java.lang.String,​A_ComponentNavaid<?>> navaids,OverlayNavigation overlay)
	{
		//Required Parameters
		//    navaids - - the shared collection of navaids
        //    overlay - - the navigation overlay that holds the navaids to be loaded
	}*/
	
	//Required parameters:
    // scanner - - the scanner for the definition
    // Throws: java.io.IOException - for any file error 
	public static ArrayList load​(java.util.Scanner scanner) throws java.io.IOException{
		
		ArrayList<Object> ArrList = new ArrayList<Object>();
		
		System.out.println("LoaderFix data from LoaderFix.load​(sc)");
		
		if(scanner.hasNext()) {
		String id = A_Loader.ReadID(scanner);
	    System.out.print(id); 
	    ArrList.add(id);
	    
	    // Make into Numbers!!!!!
	    String x = ReadLatitude(scanner);
	    System.out.print(x);
	    ArrList.add(x);
	    
	    // Make into Numbers!!!!!
	    String y = ReadLongitude(scanner);
	    System.out.print(y); 
	    ArrList.add(y);
	    
	    // Make into double!!!
	    String ft = ReadAltitude(scanner);
	    System.out.print(ft); 
	    ArrList.add(ft);
		}
		
		System.out.println();
		System.out.println();
		
		/*for(Object item : ArrList) {
			ArrList.remove(item).remove(",");
		}*/
		
		return ArrList;
	}
}
