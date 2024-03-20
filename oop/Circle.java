package oop;

public class Circle {

    private double raduis;
    private String color;


    public double getRaduis() {
        return this.raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  

    public  double getArea(){
        return  Math.PI * raduis * raduis;
    }

    public  double getCircum(){
        return  Math.PI * 2 * raduis;
    }


    @Override
    public String toString() {
        return "{" +
            " raduis='" + getRaduis() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }

    
}