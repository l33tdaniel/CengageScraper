import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
    public static void startTab() {
        System.out.println("placeholder");
        // locating where the webdriver is
        System.setProperty("webdriver.chrome.driver", "/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/chromedriver");
            WebDriver driver = new ChromeDriver();

         //   driver.manage().timeouts.implicitylyWait(10, TimeUnit.SECONDS);
        driver.get("https://nglsync.cengage.com/portal/Account/LogOn?ReturnUrl=%2fportal");
        // close the browser, driver.close();
    }
}

/*clark class path is "CodingProjects/CengageScraper" It 
would probably be best if you take the time to fix this
until you're more familiar with the class path system on mac
*/