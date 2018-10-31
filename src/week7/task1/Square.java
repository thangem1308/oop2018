package week7.task1;

public class Square extends Expression {
    Expression expression;
    public Square(Expression expression){
        this.expression=expression;
    }
    @Override
    public String toString(){
        return "(" + this.expression.toString() + ")^2";
    }
    @Override
    public int evaluate(){
        return this.expression.evaluate()*this.expression.evaluate();
    }
}
