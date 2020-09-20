
import org.junit.Assert;
import org.junit.Test;

public class MainClassMethodUnitTest {

    @Test
    public void validateInputTest(){

        Assert.assertTrue(Main.validateInput("a"));
        Assert.assertTrue(Main.validateInput("b"));
        Assert.assertTrue(Main.validateInput("c"));
        Assert.assertTrue(Main.validateInput("d"));
        Assert.assertTrue(Main.validateInput("e"));
        Assert.assertTrue(Main.validateInput("A"));
        Assert.assertTrue(Main.validateInput("B"));
        Assert.assertTrue(Main.validateInput("C"));
        Assert.assertTrue(Main.validateInput("D"));
        Assert.assertTrue(Main.validateInput("E"));

        Assert.assertFalse(Main.validateInput("aa"));
        Assert.assertFalse(Main.validateInput("1"));


    }

    @Test
    public void ifNumberTest(){

        Assert.assertTrue(Main.ifNumber("1"));
        Assert.assertTrue(Main.ifNumber("2.1"));
        Assert.assertTrue(Main.ifNumber("0"));
        Assert.assertTrue(Main.ifNumber("0.3"));

        Assert.assertFalse(Main.ifNumber("a"));
        Assert.assertFalse(Main.ifNumber("A"));
        Assert.assertFalse(Main.ifNumber("1a"));
        Assert.assertFalse(Main.ifNumber("a1"));

    }
}
