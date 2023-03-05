import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        Dimension windowSize = new Dimension(300,300);
        driver.manage().window().setSize(windowSize);
        driver.get("https://www.google.com");
        JavascriptException executor = (JavascriptException) driver;
        //driver.quit(); //zamyka wszystkie okna
        driver.close(); // zamyka pierwotne okno potencjalne nowe okno jest dalej otwarte
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
