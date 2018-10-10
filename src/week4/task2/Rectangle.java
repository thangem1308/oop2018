package week4.task2;

/**
 * tạo class rectangle là dẫn xuất cảu shape
 * thuộc tính : witdth,length và các phương thức getter,setter
 * phương thức : getArea,getPerimeter
 */
public class Rectangle extends Shape {
        private double width=1.0,length=1.0;

        public Rectangle(){}
        public Rectangle(double width,double length){this.width=width;this.length=length;}
        public Rectangle(double width,double length,boolean filled){this.width=width;this.length=length;this.filled=filled;}
        public double getWidth(){ return  width;}
        public void setWidth(double width){this.width=width;}
        public double getLength(){return  length;}
        public void setLength(double length){this.length=length;}

    /**
     * @return diện tích rectangle
     */
    public double getArea (){ return width*length;}

    /**
     * @return chu vi rectangle
     */
    public double getPerimeter(){return  2*(width+length);}

    /**
     * @return thông tin rectangle
     */
    public String toString(){
            String s;
            s=super.toString()+","+width+","+length;
            return s;
        }
}
