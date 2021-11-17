package atcsim.loader.test;

import atcsim.loader.NavigationOverlayBuilder;

// Defines a basic tester for the loader.
public class LoaderTester extends java.lang.Object{
	// constructor 
	// public LoaderTester(){};
	
	// Starts the test.
	public static void main(String[] args){
		NavigationOverlayBuilder navigationOverlayBuilder = new NavigationOverlayBuilder();
		try
		{
			navigationOverlayBuilder.loadDefinition("filename");
		}
		catch(Exception e)
		{

		}
	}

}
