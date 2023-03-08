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
        By all = By.cssSelector("*");
        driver.findElement(all);
        By ulInsideDiv = By.cssSelector("div ul");
        By trTable = By.cssSelector("table tr");
        By trInBody = By.cssSelector("tbody tr");
        driver.findElement(ulInsideDiv);
        driver.findElement(trTable);
        driver.findElement(trInBody);
        By firstChildUlInDiv = By.cssSelector("div > ul");
        By firstChildTrInTbody = By.cssSelector("tbody > tr");
        driver.findElement(firstChildTrInTbody);
        driver.findElement(firstChildUlInDiv);
        By formNextToLabel = By.cssSelector("label + form");
        By allFormNextToLabel = By.cssSelector("label ~ form");
        driver.findElement(formNextToLabel);
        driver.findElement(allFormNextToLabel);


    }
}
