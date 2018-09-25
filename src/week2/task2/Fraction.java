package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator , denominator;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction addResult;
        addResult.numerator=this.numerator*other.denominator + this.denominator*other.numerator;
        addResult.denominator=other.denominator*this.denominator;
        return addResult;
        //return null;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction subtractResult;
        subtractResult.numerator=this.numerator*other.denominator - this.denominator*other.numerator;
        subtractResult.denominator=other.denominator*this.denominator;
        return subtractResult;
        // return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiplyResult;
        multiplyResult.numerator=this.numerator*other.numerator;
        multiplyResult.denominator=this.denominator*other.denominator;
        return multiplyResult;
        //return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divideResult;
        divideResult.numerator=this.numerator*other.denominator;
        divideResult.denominator=this.denominator*other.numerator;
        return divideResult;
        //return null;
    }
    public boolean equals(Fraction other){
        // TODO: So sánh hai phân số (this và other), trả về kiểu boolean
        if (this.numerator*other.denominator-this.denominator*other.numerator==0) return true;
        return false;
    }
}
