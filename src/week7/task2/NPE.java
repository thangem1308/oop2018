package week7.task2;

public class NPE {
    public void print() throws NullPointerException{}
    public static void main(String[] args){
        try {
            NPE npe = new NPE();
            npe.print();
        } catch (NullPointerException e) {System.out.println(e);}

        }
}
