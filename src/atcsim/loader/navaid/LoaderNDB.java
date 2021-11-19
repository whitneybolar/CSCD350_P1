package atcsim.loader.navaid;

import atcsim.loader.A_Loader;

//Loads the definition of zero or more nondirectional beacon (NDB) navaids, 
//creates the corresponding navaids, and adds them to the given navigation overlay. 
public class LoaderNDB extends A_Loader{

    //Constructor creates a Creates an NDB loader.
    public LoaderNDB(java.util.Map<java.lang.String,​A_ComponentNavaid<?>> navaids,OverlayNavigation overlay)
    {
        // Required parameters:
        //    navaids - - the shared collection of navaids
        //    overlay - - the navigation overlay that holds the navaids to be loaded
    }

    //method Loads the NDB section of the definition into the overlay.
    public void load​(java.util.Scanner scanner) throws java.io.IOException
    {
        //Required parameters:
        //    scanner - - the scanner for the definition

        //Throws: java.io.IOException - for any file error
    }
}
