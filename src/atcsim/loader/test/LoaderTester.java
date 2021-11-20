package atcsim.loader.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import atcsim.loader.NavigationOverlayBuilder;
import atcsim.loader.navaid.LoaderFix;

// Defines a basic tester for the loader.
public class LoaderTester extends java.lang.Object{
	// constructor 
	// public LoaderTester(){ };
	
	// Starts the test.
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("definition1.txt"));
		
		NavigationOverlayBuilder navigationOverlayBuilder = new NavigationOverlayBuilder();
		
		// Output Calls ALL 5 
		try {
			System.out.println("LoaderFix.load​(sc) in MAIN");
			LoaderFix.load​(sc);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}

}