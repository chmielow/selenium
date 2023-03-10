import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class NewWindowsTest {

    @Test
    public void testNewWindow(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        String currentWindow = driver.getWindowHandle();

        WebElement basicLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicLink.click();
        WebElement newWindow = driver.findElement(By.id("newPage"));
        newWindow.click();
        Set<String> windowNames =driver.getWindowHandles();
        for (String window : windowNames){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        //driver.switchTo().alert().accept();
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        agreeButton.click(); // klikniecie przycisku
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Marcin");

    }
}
