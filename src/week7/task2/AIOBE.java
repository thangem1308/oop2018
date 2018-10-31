package week7.task2;

public class AIOBE{
    public void print () throws ArrayIndexOutOfBoundsException{}
    public static void main (String[] args){
        try {
            AIOBE aiobe = new AIOBE();
            aiobe.print();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
