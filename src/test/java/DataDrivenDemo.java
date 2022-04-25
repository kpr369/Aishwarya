import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDrivenDemo {


    @Test(dataProvider ="dataSender" )
    public void test1(String product, String value)
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product+value);
    }

    @Test(dataProvider ="dataSender" )
    public void test2(String product, String value)
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product+value);
    }

    @DataProvider(parallel = true)
    public Object[][] dataSender()
    {

    Object[][] obj =new Object[2][2];
    obj[0][0]="Hi";
    obj[0][1]="Hello";
        obj[1][0]="Hi1";
        obj[1][1]="Hello1";
        return obj;
    }

}

