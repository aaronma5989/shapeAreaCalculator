package entity;

public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
        super.setArea(roundToTwoDecimal((base * height)/2));
    }
}
