import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionsTest {

    @Test
    public void actionTest() throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        Actions actions = new Actions(driver);
        actions.contextClick().perform();
        //actions.contextClick(driver.findElement(By.id("myFile"))).perform();
        WebElement button = driver.findElement(By.id("bottom"));
        actions.doubleClick(button).perform();

    }
}