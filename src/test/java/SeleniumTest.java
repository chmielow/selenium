import org.openqa.selenium.InvalidArgumentException;
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
        WebDriver driver = getDriver("firefox");
        driver.get("https://www.google.com");
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
