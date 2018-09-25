package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while (a!=b){
            if (a>b) a=a-b;
            else b=b-a;
        }
        return a;
        //return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int F0=0,F1=1,n0=1;
        if (n==0) return 0;
        if (n==1) return 1;
        while (n0<=n){
            if (F0>F1) F1=F0+F1;
            else F0=F1+F0;
            n0=n0+1;
        }
        if(F0>F1) return F0;
        else return F1;
        //return 0;
    }
}
