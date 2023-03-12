package pl.testeroprogramowania;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeTest
    public void beforeTest() {
        System.out.println("I am running before test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am running before method");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("I am running before Class");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am running before suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am running after test");
    }
   @AfterMethod
    public void afterMethod() {
        System.out.println("I am running after method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("I am running after class");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("I am running after suite");
    }
}
