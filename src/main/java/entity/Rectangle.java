package entity;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
        super.setArea(roundToTwoDecimal(width * height));
    }
}
