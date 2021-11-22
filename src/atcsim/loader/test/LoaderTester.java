package atcsim.loader.test;

import atcsim.loader.NavigationOverlayBuilder;
import java.io.IOException;


// Defines a basic tester for the loader.
public class LoaderTester {
	// constructor 
	// public LoaderTester(){ };
	
	// Starts the test.
	public static void main(String[] args) throws IOException {
		(new LoaderTester()).test();
	}
	
	private void test() throws IOException {
		System.out.println("Start test!");
		NavigationOverlayBuilder loader = new NavigationOverlayBuilder();
	    loader.loadDefinition("definition1.txt");
	  }

}