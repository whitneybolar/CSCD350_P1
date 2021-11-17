package atcsim.loader;
import atcsim.graphics.view.navigation.OverlayNavigation;

// Reads a single text definition file containing zero or more navaid definitions as stated in the project specifications.

public class NavigationOverlayBuilder extends java.lang.Object {
    // For testing: In the constructor, add a print statement that says this is your code executing
	// Creates an overlay builder.
	public NavigationOverlayBuilder(){
		//System.out.println("Whitney's Code..");
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
		// System.out.println("George's Code for loadDefinition​");
		OverlayNavigation on = new OverlayNavigation(filespec); 
		return on; 
	}
}
