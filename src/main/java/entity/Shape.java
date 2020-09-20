package entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Shape {

    private String type;

    private double area;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double roundToTwoDecimal(double input){
        BigDecimal bd = new BigDecimal(input).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }

    public double getArea(){return this.area;};
    public void setArea(double area){
        this.area = area;
    }

    public String getResult() {
        return String.format("The Area of %1$s is %2$.2f", this.getType(), this.getArea());
    }


}