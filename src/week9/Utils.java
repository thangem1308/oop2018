package week9;
import java.io.*;
import java.util.Scanner;
public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        String data = new String() ;
        String line;
        FileInputStream file = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader bfreader = new BufferedReader(reader);
        while ((line =bfreader.readLine())!=null){
            data=data+line+"\n";
        }
        return data;
    }
    public static void writeContentToFile1(String path) throws IOException{
        Scanner ip = new Scanner(System.in);
        String data = ip.nextLine();
        FileOutputStream file = new FileOutputStream(path);
        OutputStreamWriter write = new OutputStreamWriter(file);
        BufferedWriter bfwrite = new BufferedWriter(write);
        bfwrite.write(data);
        bfwrite.newLine();
        bfwrite.close();
        write.close();
        file.close();
    }
    public static void writeContentToFile2(String path) throws IOException{
        Scanner ip = new Scanner(System.in);
        String data = ip.nextLine();
        FileWriter file = new FileWriter(path,true);
        BufferedWriter bfwrite = new BufferedWriter(file);
        bfwrite.newLine();
        bfwrite.write(data);
        bfwrite.close();
        file.close();
    }
    public static File findFileByName(String folderPath, String fileName){
        String path = folderPath+"\\"+fileName;
        File file = new File(path);
        if (file.exists()==true){
            System.out.println("ok");
            return file;
        }
        else{
            System.out.println("nok");
            return null;
        }
    }
    public static void main (String[] args) throws IOException {
        //File file = findFileByName("C:\\Users\\Nguyễn Thắng Em","readFile.txt");
        writeContentToFile2("C:\\Users\\Nguyễn Thắng Em\\writeFile.txt");
        //String data = readContentFromFile("C:\\Users\\Nguyễn Thắng Em\\readFile.txt");
        //System.out.println(data);
    }
}
