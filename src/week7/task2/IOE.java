package week7.task2;
import java.io.IOException;

public class IOE {
    public void write() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            IOE ioe = new IOE();
            ioe.write();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
