package entity;

public class Hexagon extends Shape{

    private double side;

    public Hexagon(double side) {
        super("Hexagon");
        this.side = side;
        super.setArea(roundToTwoDecimal(3*Math.sqrt(3)/2*Math.pow(side,2)));
    }

}
