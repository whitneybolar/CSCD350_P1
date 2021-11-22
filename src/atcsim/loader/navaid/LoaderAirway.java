package atcsim.loader.navaid;

import atcsim.datatype.*;
import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.loader.A_Loader;
import atcsim.world.navigation.A_ComponentNavaid;
import atcsim.world.navigation.ComponentNavaidAirway;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class LoaderAirway extends A_Loader {
  public LoaderAirway(Map<String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay) {
	  super(navaids, overlay);
	  System.out.println("LoaderAirway constructor!");
  }
  
  public void load(Scanner scanner) throws IOException {
	  System.out.println("LoaderAirway load!");
	  boolean sectionFound = false;
	  while(scanner.hasNextLine()) {
		  String line = scanner.nextLine();
    	  if (line.isEmpty())
			  sectionFound = false;
		  
          if (sectionFound) {
        	  ComponentNavaidAirway airway = null;
        	  
        	  System.out.println("Process values: " + line);
        	  String[] values = line.split(" ");

        	  String id = parseId(values[0]); 
        	  System.out.println("Process ID: " + id);
        	  
        	  String mode = parseId(values[1]); 
        	  System.out.println("Process Mode: " + mode);
        	  
        	  if (mode.equals("CC")) {
            	  Latitude latitude1 = parseLatitude(values[2]);
            	  System.out.println("Process Latitude: " + latitude1);
            	  
            	  Longitude longitude1 = parseLongitude(values[3]);
            	  System.out.println("Process Longitude: " + longitude1);
            	  
            	  Altitude altitude1 = parseAltitude(values[4]);
            	  System.out.println("Process Altitude: " + altitude1);
            	  
            	  Latitude latitude2 = parseLatitude(values[5]);
            	  System.out.println("Process Latitude2: " + latitude2);
            	  
            	  Longitude longitude2 = parseLongitude(values[6]);
            	  System.out.println("Process Longitude2: " + longitude2);
            	  
            	  Altitude altitude2 = parseAltitude(values[7]);
            	  System.out.println("Process Altitude2: " + altitude2);
            	  
            	  airway = new ComponentNavaidAirway(id,
            			  new CoordinateWorld3D(latitude1, longitude1, altitude1),
            			  new CoordinateWorld3D(latitude2, longitude2, altitude2)); 
           	  
           	  
        	  } else if  (mode.equals("NC")) {
        		  String component1Id = parseId(values[2]);
            	  Latitude latitude2 = parseLatitude(values[3]);
            	  Longitude longitude2 = parseLongitude(values[4]);
            	  Altitude altitude2 = parseAltitude(values[5]);

        		  if (!navaids.containsKey(component1Id)) {
        			  // throw new RuntimeException("Missing component id: "+ component1Id);
        		  } else {
        			  airway = new ComponentNavaidAirway(id,
            			  navaids.get(component1Id),
            			  new CoordinateWorld3D(latitude2, longitude2, altitude2));
        		  }
        		  
        	  } else if  (mode.equals("NN")) {
        		  String component1Id = parseId(values[2]);
        		  String component2Id = parseId(values[3]);
        		  if (!navaids.containsKey(component1Id)) {
        			  // throw new RuntimeException("Missing component id: "+ component1Id);
        		  } else if (!navaids.containsKey(component2Id)) {
        			  // throw new RuntimeException("Missing component id: "+ component2Id);
        		  } else {
        			  airway = new ComponentNavaidAirway(id, navaids.get(component1Id), navaids.get(component2Id));
        		  }
        		  
        	  } else {
        		  throw new RuntimeException("Unknown Constructor type: "+ mode);
        	  }
        		  
        	  System.out.println("Process ComponentNavaidAirway: " + airway);

        	  // Add to the map so we can use it later to search by id
        	  if (!navaids.containsKey(id) && airway != null)
        	  {
        		  navaids.put(id, airway);
        		  overlay.addNavaid(airway);
        	  }
          }
		  
		  if (line.equals("[NAVAID:AIRWAY]"))
			  sectionFound = true;
    	
	  }
	  scanner.close();
  }
	
}
