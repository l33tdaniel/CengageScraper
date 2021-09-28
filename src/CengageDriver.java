import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;

public class CengageDriver {
    private String link;
    private WebDriver driver;

    public CengageDriver(String link) {
        this.link = link;
        System.setProperty("webdriver.chrome.driver", "/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/chromedriver");
        // the following line is what will actually start the driver.
        driver = new ChromeDriver();
        openPage(driver, link);
    }

    public String getLink() {
        return link;
    }

    public void endThis() throws Exception {
        driver.quit();
    }
    private void openPage(WebDriver driver, String link) {
        driver.get(link);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        enteringRockhurst(driver);
    }
    private void enteringRockhurst(WebDriver driver){
        try {
            WebElement school = driver.findElement(By.id("schoolSearchText"));
            school.sendKeys("ROCKHURST HIGH SCHOOL");     
            Thread.sleep(1000);
            school.sendKeys(Keys.DOWN);
            Thread.sleep(200);
            school.sendKeys(Keys.RETURN);
            Thread.sleep(1000);

        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void enteringCreds(Webdriver driver) {
        try {
            Scanner in = new Scanner(System.in);
            WebElement username = driver.findElement(By.id("UserName"));
            System.out.println("What is your username?");
            username.sendKeys(in.nextLine());
            WebElement password = driver.findElement(By.id("Password"));
            System.out.println("What is your password?");
            password.sendKeys(in.nextLine());
        }   catch(InterruptedException e) {
                System.out.println("got interrupted!");
        }
    }
    private void fillingCreds(Webdriver driver) {
        try {
            WebElement username = driver.findElement(By.id("UserName"));
            System.out.println("username");
            WebElement password = driver.findElement(By.id("Password"));
            System.out.println("password");
            }catch(Exception e) {
                System.out.println(e + " happened, and this should also be deleted regardless");
        }
    }
}






/* 

The purpose of this is to see if we can refactor what we already made
instead of just dumping everything into one doc and trying to get it to work

Started work on this on September 27th
First started working on September 28th
broke it again on 28th, but you've made a ton of progress

*/
// smrt name