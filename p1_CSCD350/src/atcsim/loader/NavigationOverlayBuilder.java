package atcsim.loader;

public class NavigationOverlayBuilder {
// In the constructor, add a print statement that says this is your code executing
	public NavigationOverlayBuilder() {
		System.out.println("Whitney's Code..");
	}
	
	public OverlayNavigation loadDefinition​(String filespec) throws java.io.IOException
	{
		System.out.println("George's Code for loadDefinition​");
		return new OverlayNavigation("overlayId12345");
	}
}
