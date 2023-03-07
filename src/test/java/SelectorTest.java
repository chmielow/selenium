import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {
    @Test
    public void FindElements(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //clickOnMe
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);
        //fname
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);
        By paraHidden = By.className("topSecret");
        WebElement parametrHidden = driver.findElement(paraHidden);
        By input = By.tagName("input");
        WebElement inputLocator = driver.findElement(input);
        inputLocator.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(input);
        System.out.println(inputs.size());
    }
}
