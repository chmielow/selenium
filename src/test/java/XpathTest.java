import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {
    @Test
    public void FindElements(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe
        //By buttonId = By.xpath("/html/body/button[@id='clickOnMe']");
        By buttonId = By.xpath("//button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname
        By firstName = By.xpath("//input[@name='fname']");
        WebElement firstNameInput = driver.findElement(firstName);

        By paraHidden = By.xpath("//p[@class='topSecret']");
        WebElement parametrHidden = driver.findElement(paraHidden);

        By input = By.xpath("//input");
        WebElement inputLocator = driver.findElement(input);
        inputLocator.sendKeys("Pierwszy");

        List<WebElement> inputs = driver.findElements(input);
        System.out.println(inputs.size());

        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        By partLink = By.xpath("//a[contains(text(),'W3Schools')]");
        WebElement linkTextSchool = driver.findElement(linkText);
        WebElement partLinkTextSchool = driver.findElement(partLink);


        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAttribute = By.xpath("//*[@name]");
        driver.findElement(elementWithAttribute);

    }
}
