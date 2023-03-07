import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {
    @Test
    public void findElements(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);
        By cssTagName = By.cssSelector("input");
        driver.findElement(cssTagName).sendKeys("Pierwszy");
        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

    }
}
