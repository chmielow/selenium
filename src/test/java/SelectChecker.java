import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class SelectChecker {

    public boolean valuesCheck(String name,WebElement element) {

        Select cars = new Select(element);
        List<WebElement> options = cars.getOptions();
        for (WebElement option : options) {
            String optionName = option.getText();
            if (optionName.equals(name)) {
                System.out.println("wartosc sie zgadza  dla " + name);
                return true;
            } else {
                System.out.println("sprawdzam kolejna opcje dla " + name);
            }
        }
        return false;
    }

}
