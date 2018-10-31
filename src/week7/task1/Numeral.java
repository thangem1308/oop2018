package week7.task1;

public class Numeral extends  Expression{
     private int giaTri;
     public Numeral (){};
     public Numeral(int giaTri){
         this.giaTri=giaTri;
     }
     @Override
    public String toString(){
         return giaTri+" ";
     }
     @Override
    public int evaluate(){
         return giaTri;
     }
}
