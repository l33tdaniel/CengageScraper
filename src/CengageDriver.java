import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;

public class CengageDriver {
    private String link;
    private WebDriver driver;
    // over time you're going to change the link to databasing to be something that is unique to each assignment
    private Databasing daniel = new Databasing("/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/Answers/Chapter27.txt");

    public CengageDriver(String link) {
        this.link = link;
        System.setProperty("webdriver.chrome.driver", "/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/chromedriver");
        // the following line is what will actually start the driver.
        driver = new ChromeDriver();
    }
    public void endThis() throws Exception {
        // this will be used to close the driver once the program is done using it.
        driver.quit();
    }
    public void openPage(String link) {
        // this opens the page and maximizes the window before closing transitioning to next function
        driver.get(link);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        enteringRockhurst(driver);
    }
    private void enteringRockhurst(WebDriver driver){
        try {
            // enters in what school you're going to
            WebElement school = driver.findElement(By.id("schoolSearchText"));
            school.sendKeys("ROCKHURST HIGH SCHOOL");     
            Thread.sleep(1000);
            school.sendKeys(Keys.DOWN);
            Thread.sleep(200);
            school.sendKeys(Keys.RETURN);
            Thread.sleep(100);
            fillingCreds();
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void enteringCreds(WebDriver driver) {
        try {
            // acquires your credentials
            Scanner in = new Scanner(System.in);
            WebElement username = this.driver.findElement(By.id("UserName"));
            System.out.println("What is your username?");
            username.sendKeys(in.nextLine());
            WebElement password = this.driver.findElement(By.id("Password"));
            System.out.println("What is your password?");
            password.sendKeys(in.nextLine());
            Thread.sleep(10);  
            launchCourse();
            password.sendKeys(Keys.ENTER);
            // memory leaks!
            in.close();
            }catch(InterruptedException e){
                System.out.println("got interrupted!");
        }
    }
    private void fillingCreds() {
        try {
            Thread.sleep(500);
            WebElement username = this.driver.findElement(By.id("UserName"));
            username.sendKeys("danielneugent");
            Thread.sleep(400);
            WebElement password = this.driver.findElement(By.id("Password"));
            password.sendKeys("Daniel0416!");
            Thread.sleep(10);
            password.sendKeys(Keys.ENTER);
            launchCourse();
            }catch(Exception e) {
                System.out.println(e + " happened, and this should also be deleted regardless");
        }
    }
    private void launchCourse() {
        // launches course...
        try{
            Thread.sleep(1000);
            WebElement launchClass = this.driver.findElement(By.id("course-8032155"));
            launchClass.click();
            Thread.sleep(500);
            switchTabs();
            //enterAssignment(driver); this will later be used the open the next assignment...
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    // this function is what we used in order to get something out of the html and put it into the txt file
    private void findImportantData() {
        try {
           // WebElement data = this.driver.findElement(By.id("hi"));
           daniel.writeFile(driver.getPageSource());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void switchTabs() {
        try {
            Thread.sleep(2000);
           // this for some reason through an error that I haveto fix later driver.get("https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&id=1258893558&snapshotId=2537071&");
            Thread.sleep(2000);
            //Keys.chord(Keys.COMMAND, "w");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
// smrt name
/*abstractString os = System.getProperty("os.name");
if (os.equals("WINDOWS")){
   Keys.chord(Keys.CONTROL, "a");
}else{
   Keys.chord(Keys.COMMAND, "a");
}
*/