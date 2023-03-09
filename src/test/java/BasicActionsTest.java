import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {
    @Test
    public void performAction(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicLink.click();

        driver.findElement(By.id("fname")).sendKeys("Marcin");

        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.clear();
        userNameInput.sendKeys("admin");
        userNameInput.sendKeys(Keys.TAB);

        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();

        //WebElement selectCar = driver.findElement(By.cssSelector("[value='saab']"));
        //selectCar.click();

        //WebElement select = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(driver.findElement(By.cssSelector("select")));
        cars.selectByValue("volvo");
        List<WebElement> options = cars.getOptions();
        for (WebElement option : options){
            System.out.println(option.getText());
        }








    }
}
