import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebDriverManagerTest {
    @Test
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);// test prestaje byc widoczny w postaci okna przegladarki
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT); // akceptowanie alertow
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('hello')");
        driver.get("https://www.google.pl");
    }
}
