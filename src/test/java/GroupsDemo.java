import org.testng.annotations.Test;

public class GroupsDemo {

    @Test(groups = "Regression")
    public void test1()
    {
        System.out.println("Testcase 1");
    }
    @Test(groups = "smoke")
    public void test2()
    {
        System.out.println("Testcase 2");
    }
    @Test(groups = "sanity",dependsOnGroups = "Regression")
    public void test3()
    {
        System.out.println("Testcase 3");
    }
    @Test(groups = {"Regression","sanity"})
    public void test4()
    {
        System.out.println("Testcase 4");
    }
    @Test(groups = "Regression")
    public void test5()
    {
        System.out.println("Testcase 5");
    }
}
