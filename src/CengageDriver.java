import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;

public class CengageDriver {
    private String[] websiteURLS = {"https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893129&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893145&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893161&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893175&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893191&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893214&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893228&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893244&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893258&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893272&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893286&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893300&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893321&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893335&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893349&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893370&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893384&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893398&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893414&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893428&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893449&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893463&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893477&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893491&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893505&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893528&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893544&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893558&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893579&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893593&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893607&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893621&", "https://ng.cengage.com/static/nb/ui/evo/index.html?eISBN=9781305668881&snapshotId=2537071&id=1258893637&"};
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
            Thread.sleep(1200);
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
            username.sendKeys("alexJones");
            Thread.sleep(400);
            WebElement password = this.driver.findElement(By.id("Password"));
            password.sendKeys("cias723ja!?!");
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
            Thread.sleep(5000);
            driver.switchTo().window(driver.getWindowHandle());
            testTime();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void testTime() {
        try {
            for(int i = 0; i < websiteURLS.length; i++) {
                Thread.sleep(2000);
                driver.get(websiteURLS[i]);
                Thread.sleep(7000);
                correctAnswers(); 
                // right below here is where we start to get tripped up
                findImportantData();
                WebElement startAssignment = this.driver.findElement(By.linkText("Resume Assignment Now"));
                // start button isn't working and then because of that it isn't going ot the next assignments after that
                startAssignment.click();
                correctAnswers();
                // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#startButton"}
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void correctAnswers() {
        System.out.println("hi");
    }
}
// smrt name
