public class Main {
    public static void main(String[] args) throws Exception {
      // this is working, just deleted it out for now while I'm testing other things.
        /*
        String CengageLink = "https://nglsync.cengage.com/portal/Account/LogOn?ReturnUrl=%2fportal";
        CengageDriver Cengage = new CengageDriver(CengageLink);
      */
      Databasing daniel = new Databasing("/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/Answers/Chapter27.txt");
      daniel.createFile();
    }
}



/*
For the windows version of this program, we're currently running 
chrome driver 94. I believe that we're in version 91 for the MacOS version 
The Chrome driver seems to work the same for both, so the main difference between the mac and windows version is that the mac
version has different file pathing.

sexy code is important!
*/
// don't forget to delete creds 