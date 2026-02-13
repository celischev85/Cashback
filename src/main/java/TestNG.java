
import org.testng.Assert;

public class TestNG {

    @org.testng.annotations.Test
    public void testAddition() {
        int actual = 2 + 2;
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testStringContains() {
        String text = "Hello, world!";
        Assert.assertTrue(text.contains("world"));
    }
}