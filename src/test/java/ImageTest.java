import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageTest {

    WebDriver driver;
    @Test
    public void imageTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement image = driver.findElement(By.tagName("img"));
        String height = image.getAttribute("naturalHeight");
        System.out.println(height);

        Assert.assertEquals(height,"223"); // aktualny stan do oczekiwanego



    }

}
