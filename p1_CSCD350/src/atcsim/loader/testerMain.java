package atcsim.loader;

public class testerMain {
	public static void main(String[] args) {
		NavigationOverlayBuilder navigationOverlayBuilder = new NavigationOverlayBuilder();
		try
		{
			navigationOverlayBuilder.loadDefinition​("filename");
		}
		catch(Exception e)
		{
		
		}
		
		// output
		System.out.println(navigationOverlayBuilder);
	}
}
