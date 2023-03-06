import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // zanalezienie przcisku
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        agreeButton.click(); // klikniecie przycisku
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));
        //Assert.assertTrue(result.isDisplayed());
        //JavascriptException executor = (JavascriptException) driver;
        //driver.quit(); //zamyka wszystkie okna
        //driver.close(); // zamyka pierwotne okno potencjalne nowe okno jest dalej otwarte
    }
    public WebDriver getDriver(String browser){
        if(browser == "chrome"){
             return new ChromeDriver();
        } if (browser == "firefox"){
           return new FirefoxDriver();
        } if (browser == "ie"){
           return new InternetExplorerDriver();
        } else {
            throw new InvalidArgumentException("invalid browser name");
        }

    }
}
