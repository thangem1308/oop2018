package week10;

import java.io.*;
import java.util.List;

public class Task1 {
    List<String> getAllFunctions(File path){return null;}

    public  static String findFunctionByName(String name)throws IOException {
        int kt = name.indexOf('(');
        int kt1=-1;
        if (kt>1) name = name.substring(0,kt-1);
        else return null;
        String line;
        String path = "C:\\Users\\Nguyễn Thắng Em\\IdeaProjects\\oop2018\\src\\week9\\Utils.java";
        FileInputStream file = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader bfreader = new BufferedReader(reader);
        while ((line =bfreader.readLine())!=null){
                if (line.contains(name)== true) {
                    kt1=line.indexOf(')');
                    System.out.println(line.substring(0,kt1+1).trim());
                    break;
                }
        }
        return null;
    }
    public static void main(String[]args) throws IOException{
        findFunctionByName("findFileByName(String,String)");
    }
}
