package entity;

public class Square extends Shape{

    private double width;

    public Square(double width) {
        super("Square");
        this.width = width;
        super.setArea(roundToTwoDecimal(width*width));
    }
}
