package week7.task1;

public class ExpressionTest {
    public static void main(String [] args){
        Numeral numeral10 = new Numeral(10);
        Numeral numeral1 = new Numeral(1);
        Numeral numeral2 = new Numeral(2);
        Numeral numeral3 = new Numeral(3);
        Square square10 = new Square(numeral10);
        Subtraction subtraction1 = new Subtraction(square10,numeral1);
        Multiplication multiplication2x3 = new Multiplication(numeral2,numeral3);
        Addition addition = new Addition(subtraction1,multiplication2x3);
        Square EketQua = new Square(addition);
        System.out.println(EketQua.evaluate());
        try {
            Numeral numeral0 = new Numeral(0);
            Numeral numeral = new Numeral(1999);
            Division division = new Division(numeral,numeral0);
            System.out.println(division.evaluate());
        } catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");;
        }
    }
}
