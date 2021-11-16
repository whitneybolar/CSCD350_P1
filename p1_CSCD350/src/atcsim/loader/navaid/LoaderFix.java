package atcsim.loader.navaid;
import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.loader.A_Loader;
import atcsim.world.navigation.A_ComponentNavaid;

public class LoaderFix extends A_Loader{

	// Creates a fix loader.
	// Parameters:
	// navaids - - the shared collection of navaids
	// overlay - - the navigation overlay that holds the navaids to be loaded
	
	public LoaderFix(java.util.Map<java.lang.String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay) {
		super(navaids, overlay);
		// TODO Auto-generated constructor stub
	}
	
	// Loads the fix section of the definition into the overlay.
	// Parameters scanner - - the scanner for the definition
	// Throws: java.io.IOException - for any file error
	public void load​(java.util.Scanner scanner) throws java.io.IOException{
		/* while() {
			readID();
			readLongitude();
			readLatitude();
			readAltitude();
		}*/
	}
}
