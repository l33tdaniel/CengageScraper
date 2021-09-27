import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;

public class CengageDriver {
    private String link;
    private WebDriver driver;

    public CengageDriver(String link) {
        this.link = link;
        System.setProperty("webdriver.chrome.driver", "/Users/danielneugent/Desktop/CodingProjects/CengageScraper/includedFiles/chromedriver");
        // the following line is what will actually start the driver.
        WebDriver name = new ChromeDriver();
    }

    public String getLink() {
        return link;
    }
    public void openUpPage() {
        driver.get(link);
    }
}


/* 


The purpose of this is to see if we can refactor what we already made
instead of just dumping everything into one doc and trying to get it to work

Started work on this on September 27th

*/

// smrt name