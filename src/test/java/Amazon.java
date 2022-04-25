import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon {

    @Test
    public void testNGProgram() {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");

        List<WebElement> headers = driver.findElements(By.xpath("//div[contains(@id,'desktop-grid')]//div[@class='a-cardui-header']/h2"));

        for (WebElement ele : headers) {

            if (ele.getText().contains("%")) {
                System.out.println(ele.getText());
            }
        }
    }


    @Test
    public void testNGDemo()
    {
        System.out.println(25);
    }
}
