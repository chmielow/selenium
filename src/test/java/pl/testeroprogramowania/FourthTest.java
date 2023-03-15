package pl.testeroprogramowania;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthTest {
    @Test(dependsOnMethods ={"thirdTest"} )
    public void firstTest(){
        System.out.println("First test");
    }
    @Test(dependsOnMethods ={"firstTest"} )
    public void secondTest(){
        System.out.println("Second test");
    }
    @Test
    public void thirdTest(){
        System.out.println("Third test");
    }
    @Test(dataProvider = "data")
    public void dpTest(String val,String number) {
        System.out.println(val);
        System.out.println(number);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        return new Object[][]{{"I am first test","first"},{"I am second test","2"},{"I am third test","3"}};

    }
}
