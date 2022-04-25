import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {


    @Test
    @Parameters(value={"Aish","tt"})
    public void testParm(String data,@Optional(value = "TestNG") String data2)
    {
        System.out.println(data);
        System.out.println(data2);
    }
}
