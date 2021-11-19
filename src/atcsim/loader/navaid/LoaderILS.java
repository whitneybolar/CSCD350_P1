package atcsim.loader.navaid;

import atcsim.loader.A_Loader;

//Loads the definition of zero or more instrument landing system (ILS) navaids, 
//creates the corresponding navaids, and adds them to the given navigation overlay. 
public class LoaderILS extends A_Loader 
{
    //constructor Creates an ILS loader.
    public LoaderILS(java.util.Map<java.lang.String,​A_ComponentNavaid<?>> navaids,OverlayNavigation overlay)
    {

    }

    //method Loads the ILS section of the definition into the overlay.
    public void load​(java.util.Scanner scanner) throws java.io.IOException
    {
        //Required parameters:
        //    scanner - - the scanner for the definition

        //Throws: java.io.IOException - for any file error 
    }

}
