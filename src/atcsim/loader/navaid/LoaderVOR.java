package atcsim.loader.navaid;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import atcsim.datatype.Altitude;
import atcsim.datatype.CoordinateWorld3D;
import atcsim.datatype.Latitude;
import atcsim.datatype.Longitude;
import atcsim.datatype.VHFFrequency;
import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.loader.A_Loader;
import atcsim.world.navigation.A_ComponentNavaid;
import atcsim.world.navigation.ComponentNavaidAirway;
import atcsim.world.navigation.ComponentNavaidVOR;

public class LoaderVOR extends A_Loader {
	  public LoaderVOR(Map<String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay) {
		  super(navaids, overlay);
		  System.out.println("LoaderVOR constructor!");
	  }
	  
	  public void load(Scanner scanner) throws IOException {
		  System.out.println("LoaderVOR load!");
		  boolean sectionFound = false;
		  while(scanner.hasNextLine()) {
			  String line = scanner.nextLine();
	    	  if (line.isEmpty())
				  sectionFound = false;
			  
	          if (sectionFound) {
	        	  ComponentNavaidVOR vor = null;
	        	  
	        	  System.out.println("Process values: " + line);
	        	  String[] values = line.split(" ");

	        	  String id = parseId(values[0]); 
	        	  VHFFrequency freq = parseVHFFrequency(values[1]); 
            	  Latitude latitude = parseLatitude(values[2]);
            	  Longitude longitude = parseLongitude(values[3]);
            	  Altitude altitude = parseAltitude(values[4]);
    			  vor = new ComponentNavaidVOR(id, new CoordinateWorld3D(latitude, longitude, altitude), freq);
	        		  
	        	  System.out.println("Process ComponentNavaidVOR: " + vor);

	        	  // Add to the map so we can use it later to search by id
	        	  if (!navaids.containsKey(id) && vor != null)
	        	  {
	        		  navaids.put(id, vor);
	        		  overlay.addNavaid(vor);
	        	  }
	          }
			  
			  if (line.equals("[NAVAID:VOR]"))
				  sectionFound = true;
	    	
		  }
		  scanner.close();
	  }

}