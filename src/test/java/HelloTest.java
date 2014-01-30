import junit.framework.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testSay() throws Exception {
        Assert.assertEquals("hello", new Hello().say());
    }
}
