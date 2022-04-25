import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssetionsDemo {
    @Test
    public void test()
    {
        String expected = "google";
        String actual ="google";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actual,expected,"Title are not matching");
        sa.assertEquals(2,4,"safd");
        sa.assertFalse(true);
        sa.assertTrue(false);

        sa.assertAll();
    }
}
