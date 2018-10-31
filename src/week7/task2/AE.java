package week7.task2;

public class AE {
    public void print() throws ArithmeticException {}
    public static void main (String [] args) {
        try {
            AE ae = new AE();
            ae.print();
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
