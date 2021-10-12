import java.io.IOException;
import java.io.FileWriter;
public class Databasing {
    private String path;
    private FileWriter writer;
    public Databasing(String path) {
        try {
            this.path = path;
            this.writer = new FileWriter(path);
            System.out.println("file initiated");
        }catch (IOException e) {
            System.out.println(e);
        }
    }
   public void writeFile() {
        try {
            this.writer.write("why won't this work?");
            for(int i = 0; i < 5; i++) {
                this.writer.write("hi");
            }
            this.writer.flush();
        } catch(Exception e) {
            System.out.print(e);
        }
    }
    // overloading functions!!
    public void writeFile(String text) {
        try {
            for(int i = 0; i < 25; i++)
            System.out.println("WE IN HERE BABY");
            this.writer.write(text);
            this.writer.flush();
        } catch(Exception e) {
            System.out.print(e);
        }
    }
    private void closeFile() {
        // call this only when you're absolutely done.
        try {
            this.writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}