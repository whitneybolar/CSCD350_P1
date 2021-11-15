package atcsim.graphics.view.navigation;

// Defines a radar overlay for a navigation aids.

public class OverlayNavigation { // extends A_RadarOverlay<OverlayNavigation>
		String id;
		
		// Creates a navigation overlay.
		public OverlayNavigation(java.lang.String id)
		{
			System.out.println("George's Code OverlayNavigation constructor");
			this.id = id;
		}
	
		// Create an InputStream from a FileInputStream for the scanner. 
		// Also create the OverlayNavigation.
    		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/FileInputStream.html
		// https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html
	
		// Adds a navaid to this overlay.
		// Parameters: navaid - - the navaid
		// public void addNavaid​(A_ComponentNavaid<?> navaid)
		
		// Gets the navaids on this overlay as an unmodifiable list.
		// Returns the navaids
		// public java.util.List<A_ComponentNavaid<?>> getNavaids()
		
		// Generates an XML representation of the contents of this object. This representation is for display purposes only, not as a data structure.
		// Specified by: toXML_ in interface I_XMLable
		// Overrides: toXML_ in class A_RadarOverlay<OverlayNavigation>
		// Parameters: instream - - any stream to inject into this one as appropriate. Whether this is required, prohibited, or optional depends on the method implementation. If present, only one element is allowed.
		// Returns: the representation
		// public java.lang.StringBuilder toXML_​(java.lang.StringBuilder... instream)
}
