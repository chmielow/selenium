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
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");
    }
}
