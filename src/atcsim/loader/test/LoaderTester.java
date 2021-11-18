package atcsim.loader.test;

import java.io.File;
import java.util.Scanner;

import atcsim.loader.NavigationOverlayBuilder;

// Defines a basic tester for the loader.
public class LoaderTester extends java.lang.Object{
	// constructor 
	// public LoaderTester(){ };
	
	// Starts the test.
	public static void main(String[] args){
		System.out.println("Main");
		NavigationOverlayBuilder navigationOverlayBuilder = new NavigationOverlayBuilder();
		
		try {
			  Scanner sc = new Scanner(new File("definition1.txt"));
		      navigationOverlayBuilder.load(sc);
		      
		}
		catch(Exception e)
		{

		}
		
	}

}