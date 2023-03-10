import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeTest {

    @Test
    public void testIframe(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("fname")).sendKeys("Marcin");
        driver.switchTo().defaultContent(); //wracanie do pierwotnej strony
        System.out.println(driver.findElement(By.tagName("h1")).getText());



    }
}
