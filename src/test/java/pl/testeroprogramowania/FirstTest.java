package pl.testeroprogramowania;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

@Listeners(value = {SampleTestListener.class})
public class FirstTest extends BaseTest {

    WebDriver driver;
    @Test @Ignore
    public void firstTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        //Thread.sleep(5000);
        //FluentWait<WebDriver> wait = new FluentWait<>(driver);

        waitForElementExist(By.cssSelector("p"));

        WebElement para = driver.findElement(By.cssSelector("p"));
        Assert.assertEquals(para.isDisplayed(),true);
        Assert.assertTrue(para.isDisplayed(), "element is not displayed");
        Assert.assertTrue(para.getText().startsWith("Dopiero"));
        Assert.assertFalse(para.getText().startsWith("Pojawiłem"));

        Assert.assertEquals(para.getText(),"Dopiero się pojawiłem!");
        //Assert.assertEquals(para.getText(), "Dopiero","tesksty sa rozne");

        driver.quit();
    }
    @Test
    public void secondTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        //Thread.sleep(5000);
        //<WebDriver> wait = new FluentWait<>(driver);

        waitForElementExist(By.cssSelector("p"));

        WebElement para = driver.findElement(By.cssSelector("p"));
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(para.isDisplayed(),true);
        softAssert.assertTrue(para.isDisplayed(), "element is not displayed");
        softAssert.assertTrue(para.getText().startsWith("Dopiero"));
        softAssert.assertFalse(para.getText().startsWith("Pojawiłem"));
        //softAssert.assertEquals(para.getText(), "Dopiero","tesksty sa rozne");
        //.assertEquals(para.getText(),"Dopiero się ", "druga assercja");
        driver.quit();
        softAssert.assertAll();

    }

    public void waitForElementExist(By locator){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

        wait.until((driver) -> {
                List<WebElement> elements = driver.findElements(locator);
                if(elements.size()>0){
                    System.out.println("element jest na stronie");
                    return true;
                } else {
                    System.out.println("elementu nie ma na stronie");
                    return false;
                }

        });
    }

}
