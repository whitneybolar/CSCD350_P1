package atcsim.loader;
import atcsim.graphics.view.navigation.OverlayNavigation;

// Reads a single text definition file containing zero or more navaid definitions as stated in the project specifications.

public class NavigationOverlayBuilder extends java.lang.Object {
    // For testing: In the constructor, add a print statement that says this is your code executing
	// Creates an overlay builder.
	public NavigationOverlayBuilder() {
		System.out.println("Whitney's Code..");
	}
   
    // Loads the definition file and builds the navaids by calling their appropriate loaders.
    // Parameters:
    // filespec - - the fully qualified filename of the definition file
	// Returns:
	// the populated navigation overlay
	// Throws:
	// java.io.IOException - for any file error
	public OverlayNavigation loadDefinition(String filespec) throws java.io.IOException
	{
		System.out.println("George's Code for loadDefinition​");
		return new OverlayNavigation("overlayId12345");
	}
}
