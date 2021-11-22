package atcsim.loader;

import atcsim.datatype.Altitude;
import atcsim.datatype.Latitude;
import atcsim.datatype.Longitude;
import atcsim.datatype.VHFFrequency;
import atcsim.graphics.view.navigation.OverlayNavigation;
import atcsim.support.Assert;
import atcsim.world.navigation.A_ComponentNavaid;
import java.util.Map;

public abstract class A_Loader {
	
	protected Map<String, A_ComponentNavaid<?>> navaids;
	protected OverlayNavigation overlay;
	
	public A_Loader(Map<String, A_ComponentNavaid<?>> navaids, OverlayNavigation overlay) {
	  System.out.println("A_Loader constructor!");
	  Assert.nonnull(overlay);
	  Assert.nonnull(navaids);
	  this.navaids = navaids;
	  this.overlay = overlay;
	}

	protected String parseId(String input) {
  	  return input.split(",")[0]; 
	}

	protected String parseMode(String input) {
	  	  return input.split(",")[0]; 
		}
	
	protected Latitude parseLatitude(String input) {
	  String[] values = input.split(",");
	  String degrees = values[0]; 
	  String minutes = values[1]; 
	  String seconds = values[2];
	  return new Latitude(Integer.parseInt(degrees), Integer.parseInt(minutes), Double.parseDouble(seconds));
	}
	
	protected Longitude parseLongitude(String input) {
	  String[] values = input.split(",");
	  String degrees = values[0]; 
	  String minutes = values[1]; 
	  String seconds = values[2];
	  return new Longitude(Integer.parseInt(degrees), Integer.parseInt(minutes), Double.parseDouble(seconds));
	}

	protected Altitude parseAltitude(String input) {
	  return new Altitude(Double.parseDouble(input.split(",")[0]));
	}
	
	protected VHFFrequency parseVHFFrequency(String input) {
		  String[] values = input.split(",");
		  String mHz = values[0]; 
		  String kHz = values[1]; 
		  return new VHFFrequency(Integer.parseInt(mHz), Integer.parseInt(kHz));
		}
	
}
