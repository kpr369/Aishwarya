import org.testng.annotations.*;

import java.util.Date;

public class TestNGAnnotations {

    /*
        BeforeSuite 500 -> 1
        Before test tag -- Each test ->1
        Before each Class ->1
        Beofore Method for each test ->1
        After Method for each test ->1
        After Class for each class ->1
        After Test for each test->1
        After Suite ->1
     */
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suit");
        System.out.println("Execution start Time: "+new Date());
    }

    @Test
    public void testMe()
    {
        System.out.println("Test Case");
    }

    @Test
    public void testMe2()
    {
        System.out.println("Test Case2");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");

    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");

    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");

    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");

    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suit");
        System.out.println("Execution Completed Time: "+new Date());
    }

}
