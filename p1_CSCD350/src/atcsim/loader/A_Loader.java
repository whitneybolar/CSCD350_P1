package atcsim.loader;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.loader.navaid.LoaderFix;
import atcsim.world.navigation.A_ComponentNavaid;

public abstract class A_Loader extends java.lang.Object {
	
	private Map<String, A_ComponentNavaid<?>> navaids;
	private OverlayNavigation overlay;
	
    // Scanner s = new Scanner("FileName"); // inputStream()
	
	HashMap hm = new HashMap();
	
	
	LoaderFix LF = new LoaderFix(hm, overlay);
	
	// LF.load(s);
	
	// Creates a loader.
	// Parameters: navaids - - the shared collection of navaids
	// overlay - - the navigation overlay that holds the navaids to be loaded

      public A_Loader(java.util.Map<java.lang.String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay){
    	  this.navaids = navaids;
    	  this.overlay = overlay; 
      }
}