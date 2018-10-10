package week4.task2;

/**
 * Khai báo class shape
 * Thuộc tính : color , filled
 * Phương thức : shape,getColor,setColor,isFilled,setFilled,toString
 */
public class Shape {
        protected String color="red";
        protected boolean filled=true;
        public  Shape() {}

    /**
     * Shape khởi tạo các thuộc tính
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled) {
            this.color=color;
            this.filled=filled;
        }
        public String getColor() {return color;}
        public void setColor(String color) {this.color=color;}
        //public boolean isFilled(){}
        public void setFilled(boolean filled){ this.filled=filled; }

    /**
     * @return thông tin của shape
     */
    public String toString(){
            String s;
            s=color+","+filled;
            return s;
        }
}
