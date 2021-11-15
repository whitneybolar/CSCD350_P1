package atcsim.loader;

import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.world.navigation.A_ComponentNavaid;

public abstract class A_Loader extends java.lang.Object {
	
	// Creates a loader.
	// Parameters: navaids - - the shared collection of navaids
	// overlay - - the navigation overlay that holds the navaids to be loaded
	

      public A_Loader(java.util.Map<java.lang.String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay){
    	  
      }
}