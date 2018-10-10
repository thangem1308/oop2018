package week4.task2;

/**
 * tạo class circle là dẫn xuất của shape
 * @param //radius là bán kính của circle
 */
public class Circle extends Shape {
    private double radius; private double PI=3.14;

    public Circle() {}
    public Circle(double radius) {this.radius=radius;}
    public Circle(double radius,String color,boolean filled) {this.radius=radius;this.color=color;this.filled=filled;}
    public double getRadius(){return  radius;}
    public void setRadius(double radius) {this.radius=radius;}

    /**
     * @return diện tích của circle
     */
    public double getArea(){return (PI*radius*radius);}

    /**
     * @return chu vi circle
     */
    public double getPerimeter(){return (2*PI*radius);}

    /**
     * @return thông tin circle
     */
    public String toString(){
        String s;
        s=super.toString()+","+radius;
        return s;
    }

}
