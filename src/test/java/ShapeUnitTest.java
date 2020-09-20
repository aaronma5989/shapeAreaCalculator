import entity.*;
import org.junit.Test;
import org.junit.Assert;


public class ShapeUnitTest {

    private final double side = 2.0;
    private final double width = 3.0;
    private final double height = 4.0;
    private final double base = 5.0;


    @Test
    public void hexagonTest(){

        Shape hexagon = new Hexagon(side);

        Assert.assertEquals("Hexagon", hexagon.getType());
        Assert.assertEquals(10.39, hexagon.getArea(), 0);
        Assert.assertEquals("The Area of Hexagon is 10.39", hexagon.getResult());

    }

    @Test
    public void RectangleTest(){

        Shape rectangle = new Rectangle(width, height);

        Assert.assertEquals("Rectangle", rectangle.getType());
        Assert.assertEquals(12, rectangle.getArea(), 0);
        Assert.assertEquals("The Area of Rectangle is 12.00", rectangle.getResult());

    }

    @Test
    public void squareTest(){

        Shape square = new Square(width);

        Assert.assertEquals("Square", square.getType());
        Assert.assertEquals(9, square.getArea(), 0);
        Assert.assertEquals("The Area of Square is 9.00", square.getResult());

    }

    @Test
    public void triangleTest(){

        Shape triangle = new Triangle(base, height);

        Assert.assertEquals("Triangle", triangle.getType());
        Assert.assertEquals(10, triangle.getArea(), 0);
        Assert.assertEquals("The Area of Triangle is 10.00", triangle.getResult());

    }
}
