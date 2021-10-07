import java.io.File;
public class Main {
    public static void main(String[] args) throws Exception {
      // this is what makes all of the folders for the files

      databaseMaker theBeast = new databaseMaker();
      // theBeast.testMakeFolder(); don't run this unless you want to make a bunch of stuff

      // this opens up the driver to the site that we need to get to.
        String CengageLink = "https://nglsync.cengage.com/portal/Account/LogOn?ReturnUrl=%2fportal";
        CengageDriver Cengage = new CengageDriver(CengageLink);
        Cengage.openPage(CengageLink);
        
      // this gets us to be able to open up the file in order to write to it.
        Databasing addingInAnswers = new Databasing("/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/Answers/Chapter27.txt");
      
    }
}
// sexy code is important!
