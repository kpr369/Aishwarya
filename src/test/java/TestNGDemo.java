import org.testng.annotations.Test;

public class TestNGDemo {
/*
priority
Description
InvocationCOunt
Enabnled
dependsOnMethods
alwaysRun
@Test
 */


    @Test(priority = 0,description = "This is method")
    public void Login() {
        System.out.println("Login");
        System.out.println(5/0);
    }

    @Test(dependsOnMethods = "Login",alwaysRun = true)
    public void HomePage() {
        System.out.println("HomePage");
    }

    @Test(priority = 1)
    public void Logout() {
        System.out.println("Logout");
    }

}
