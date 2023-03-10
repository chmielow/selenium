import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IframeTest {

    @Test
    public void testIframe(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("fname")).sendKeys("Marcin");
        driver.switchTo().defaultContent(); //wracanie do pierwotnej strony
        System.out.println(driver.findElement(By.tagName("h1")).getText());



    }
}
