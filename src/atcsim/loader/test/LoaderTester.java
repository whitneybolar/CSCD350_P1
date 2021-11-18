package atcsim.loader.test;

import atcsim.loader.NavigationOverlayBuilder;

// Defines a basic tester for the loader.
public class LoaderTester extends java.lang.Object{
	// constructor 
	// public LoaderTester(){};
	
	// Starts the test.
	public static void main(String[] args){
		System.out.println("Main");
		NavigationOverlayBuilder navigationOverlayBuilder = new NavigationOverlayBuilder();
		try
		{
			navigationOverlayBuilder.load(null);
		}
		catch(Exception e)
		{

		}
		
	}

}