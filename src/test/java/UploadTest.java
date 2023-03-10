import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadTest {
    @Test
    public void uploadFile(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\Marcin\\Downloads\\Aplikacja.txt");


    }
}
