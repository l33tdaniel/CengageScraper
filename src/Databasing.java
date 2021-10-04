import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Databasing {
    private String path;
    private File writer;
   public Databasing(String path) {
    File writer = new File(path);
    this.path = path;
    createFile();
   }
   
   public void createFile() {
       // this will get a bit tricky.
        if(this.writer.exists()) {
            for(int i = 0; i < 10; i++){
            try{
                FileWriter daniel = new FileWriter(this.writer.getAbsolutePath());
                daniel.write(System.getProperty( "line.separator" ));
                daniel.write("testing something new");
                daniel.write(System.getProperty("line.separator"));
                daniel.close();
            } catch(IOException e) {
                System.out.println(e);
            }
        }
        }
    }
}









/*
    this returns true!
        File test = new File("/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/Answers/Chapter27.txt");
        System.out.println(test.exists());





Possible windows version 
File myObj = new File("C:\\Users\\MyName\\filename.txt");

*/