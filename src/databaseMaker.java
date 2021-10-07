import java.io.File;
public class databaseMaker {
    private File file;
    public databaseMaker() {
        file = new File("/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/Answers/Testing.txt");
    }
    public void creatingFiles() {
        try {   
            File Forge = new File("/Users/" + System.getProperty("user.name") + "/Desktop/", "test.txt");
            Forge.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // this works, now we just have to build a database for it.
    public void testMakeFolder() {
        new File("/Users/" + System.getProperty("user.name") + "/Desktop/directory").mkdirs();
        for(int i = 0; i < 33; i++) {
            new File("/Users/" + System.getProperty("user.name") + "/Desktop/directory/Chapter: " + i).mkdirs();
        }    
    }
}
