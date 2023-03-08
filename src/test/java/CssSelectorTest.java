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

        By attrTag = By.cssSelector("input[name= fname]");
        By attrContains = By.cssSelector("[name*= 'name'");
        By attrStarts = By.cssSelector("[name^= 'f'");
        By attrEnd = By.cssSelector("[name$= 'ame'");
        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnd);

        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");
        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);


    }
}
