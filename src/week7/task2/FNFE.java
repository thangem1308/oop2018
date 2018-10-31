package week7.task2;
import java.io.FileNotFoundException;

public class FNFE {
    public void test() throws FileNotFoundException {
        throw new FileNotFoundException();

    }
    public static void main(String[] args){
        try {
            FNFE fnfe = new FNFE();
            fnfe.test();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}