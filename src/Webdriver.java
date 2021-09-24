import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.*;

public class Webdriver {
    public static void startTab() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("placeholder");
        // locating where the webdriver is
        System.setProperty("webdriver.chrome.driver", "/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://nglsync.cengage.com/portal/Account/LogOn?ReturnUrl=%2fportal");
        Thread.sleep(3000);


        WebElement school = driver.findElement(By.id("schoolSearchText"));
        school.sendKeys("Rockhurst High School");
        Thread.sleep(400);
        
        Thread.sleep(4000);

        WebElement username = driver.findElement(By.id("UserName"));
        System.out.println("What is your username?");
        username.sendKeys(in.nextLine());
        WebElement password = driver.findElement(By.id("Password"));
        System.out.println("What is your password?");
        password.sendKeys(in.nextLine());

        in.close();
        // don't want the memory leaks..
        password.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement launchClass = driver.findElement(By.id("course-8032155"));
        launchClass.click();
        Thread.sleep(4000);
        driver.close();
        
       
        /*
// test 
        element = driver.find_element :xpath, '//input[@name="q"]'
element.click();
        WebElement launchClass = driver.findElement(By.id("course-8032155"));

        */
    }
}
