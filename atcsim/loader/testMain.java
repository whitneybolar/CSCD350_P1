package atcsim.loader;

public class testMain {
	public static void main(String[] args) {
		NavigationOverlayBuilder navigationOverlayBuilder = new NavigationOverlayBuilder();
		
		try
		{
			navigationOverlayBuilder.loadDefinition("filename");
		}
		catch(Exception e)
		{

		}
		
		// Output
		System.out.println(navigationOverlayBuilder);
	}
}
