package atcsim.loader;

import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.loader.navaid.*;
import atcsim.support.I_XMLable;
import atcsim.world.navigation.A_ComponentNavaid;

//Reads a single text definition file containing zero or more navaid definitions as stated in the project specifications.
public class NavigationOverlayBuilder {
	
	// For testing: In the constructor, add a print statement that says this is your code executing
	// Creates an overlay builder.
	public NavigationOverlayBuilder(){
		System.out.println("NavigationOverlayBuilder constructor");
	}
	
	// Create an InputStream from a FileInputStream for the scanner. 
	// Also create the OverlayNavigation.
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileInputStream.html
	// https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html
	// Loads the definition file and builds the navaids by calling their appropriate loaders.
	// Parameters:
	// filespec - - the fully qualified filename of the definition file
	// Returns:
	// the populated navigation overlay
	// Throws:
	// java.io.IOException - for any file error
	public OverlayNavigation loadDefinition(String filespec) throws java.io.IOException
	{
		System.out.println("George's Code for loadDefinition");

		OverlayNavigation overlayNavigation = new OverlayNavigation("navigationID");
		HashMap<String, A_ComponentNavaid<?>> navaids = new HashMap<String, A_ComponentNavaid<?>>();

		(new LoaderFix(navaids, overlayNavigation)).load(new Scanner(new FileInputStream(filespec)));
		(new LoaderNDB(navaids, overlayNavigation)).load(new Scanner(new FileInputStream(filespec)));
		(new LoaderVOR(navaids, overlayNavigation)).load(new Scanner(new FileInputStream(filespec)));
		(new LoaderILS(navaids, overlayNavigation)).load(new Scanner(new FileInputStream(filespec)));
		(new LoaderAirway(navaids, overlayNavigation)).load(new Scanner(new FileInputStream(filespec)));
		
		return overlayNavigation; 
	}
	
}


