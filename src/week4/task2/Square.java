package week4.task2;

/**
 * tạo class Square là dẫn xuất của rectangle
 * thuộc tính side
 * phương thức kế thừa toString
 */
public class Square extends Rectangle {
    private double side;

    public Square(){}
    public Square(double side){this.side=side;}
    public Square(double side,String color,boolean filled){this.side=side;this.color=color;this.filled=filled;}
    public double getSide(){return side;}
    public void setSide(double side){width=side;length=side;}
    public void setWidth(double side){setSide(side);}
    public void setLength(double side){setSide(side);}

    /**
     * @return thông tin Square
     */
    public String toString(){
        String s;
        s=super.toString()+","+side;
        return s;
    }
}
