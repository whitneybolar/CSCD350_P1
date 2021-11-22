package atcsim.loader.navaid;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.loader.A_Loader;
import atcsim.world.navigation.A_ComponentNavaid;

public class LoaderILS extends A_Loader {
	  public LoaderILS(Map<String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay) {
		  super(navaids, overlay);
		  System.out.println("LoaderILS constructor!");
	  }
	  
	  public void load(Scanner scanner) throws IOException {
		  System.out.println("LoaderILS load!");
	  }

}