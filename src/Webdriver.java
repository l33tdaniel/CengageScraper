import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
    public static void startTab() throws InterruptedException {
        
        System.out.println("placeholder");
        // locating where the webdriver is
        System.setProperty("webdriver.chrome.driver", "/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://nglsync.cengage.com/portal/Account/LogOn?ReturnUrl=%2fportal");
        // pulls the website URL
        String daniel = driver.getTitle();
        System.out.println(daniel);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();
        // close the browser, driver.close();
    }   
}
