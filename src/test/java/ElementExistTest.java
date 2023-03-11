import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ElementExistTest {

    WebDriver driver;
    @Test
    public void elementExistTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(elementExist(By.tagName("p")));
        System.out.println(elementExist(By.id("topSecret")));

        System.out.println(elementExistSecond(By.tagName("p")));
        System.out.println(elementExistSecond(By.id("topSecret")));

        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());

        System.out.println(driver.findElement(By.tagName("button")).isDisplayed());

        System.out.println(driver.findElement(By.tagName("button")).isEnabled());
        // aby element byl klikalny musi wracac metody isDisplayed i isEnabled jako true



        //driver.findElement(By.tagName("p"));
        //driver.findElement(By.id("topSecret"));


    }

    public boolean elementExist(By locator){
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
    public boolean elementExistSecond(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
