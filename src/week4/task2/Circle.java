package week4.task2;

public class Circle extends Shape {
    private double radius=1.0; private double PI=3.14;

    public Circle() {}
    public Circle(double radius) {this.radius=radius;}
    public Circle(double radius,String color,boolean filled) {this.radius=radius;this.color=color;this.filled=filled;}
    public double getRadius(){return  radius;}
    public void setRadius(double radius) {this.radius=radius;}
    public double getArea(){return (PI*radius*radius);}
    public double getPerimeter(){return (2*PI*radius);}
    public String toString(){
        String s;
        s=super.toString()+","+radius;
        return s;
    }

}
