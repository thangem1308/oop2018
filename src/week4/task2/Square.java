package week4.task2;

public class Square extends Rectangle {
    private double side;

    public Square(){}
    public Square(double side){this.side=side;}
    public Square(double side,String color,boolean filled){this.side=side;this.color=color;this.filled=filled;}
    public double getSide(){return side;}
    public void setSide(double side){this.side=side;}
    public void setWidth(double side){}
    public void setLength(double side){}
    public String toString(){
        String s;
        s=super.toString()+","+side;
        return s;
    }
}
