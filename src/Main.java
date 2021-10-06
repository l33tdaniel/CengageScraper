public class Main {
    public static void main(String[] args) throws Exception {
      // this opens up the driver to the site that we need to get to.
        String CengageLink = "https://nglsync.cengage.com/portal/Account/LogOn?ReturnUrl=%2fportal";
        CengageDriver Cengage = new CengageDriver(CengageLink);
        Cengage.openPage(CengageLink);
      // this gets us to be able to open up the file in order to write to it.
        Databasing daniel = new Databasing("/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/Answers/Chapter27.txt");
    }
}

/*
How are you going to be able to pass what you grabfrom the cengage scraper into a
java file?
sexy code is important!
*/

