package atcsim.loader;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import atcsim.loader.navaid.LoaderFix;
import atcsim.loader.navaid.LoaderNDB;

//Code References: 
// https://www.w3schools.com/java/java_hashmap.asp


//Reads a single text definition file containing zero or more navaid definitions as stated in the project specifications.

public class NavigationOverlayBuilder extends java.lang.Object {
	
	// For testing: In the constructor, add a print statement that says this is your code executing
	// Creates an overlay builder.
	public NavigationOverlayBuilder(){
		
		try{
		      /*while(sc.hasNext()) {
		    	System.out.println();
		    	System.out.print(sc.next());
		      }*/
			
			  // Scan the the text file 
			  Scanner sc = new Scanner(new File("definition1.txt"));
			
		      System.out.println();
		      
		      // Grab Array list from LoaderFix
		      ArrayList a = LoaderFix.load​(sc);
		      System.out.println("LoaderFix.load​(sc) ArrayList in NOB..");
		      System.out.println(a.toString().replace(",,",","));
		      System.out.println();
		      
		      // Grab Array list from LoaderNDB
		      ArrayList b = LoaderNDB.load​(sc);
		      System.out.println("LoaderNDB.load​(sc) ArrayList in NOB..");
		      System.out.println(b.toString().replace(",,",","));
		      System.out.println();
		      System.out.println();
		      
		      sc.close();
		      
		      // Make the HashMap and add the array lists to the HashMap 
		      HashMap<String, ArrayList<?>> hm = new HashMap<String, ArrayList<?>>();
		      hm.put("[NAVAID:FIX]", a);
		      
		      // print out the HashMap
		      // *Code Reference: https://www.w3schools.com/java/java_hashmap.asp
		      System.out.println("Hashmap so far...");
		      for (String i : hm.keySet()) {
		        System.out.println("key: " + i + " value: " + hm.get(i));
		      }
		      System.out.println();
			}
			catch(Exception e){

			}
		}
	
}


