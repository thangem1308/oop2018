package week7.task2;

public class CCE{
    public int converters() {throw new  ClassCastException();}
    public static void main(String[] args){
        try {
            CCE cce = new CCE();
            cce.converters();
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}