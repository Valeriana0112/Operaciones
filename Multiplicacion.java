public class Multiplicacion extends Operaciones {
    public double multiplicar() {
        return getNum1() * getNum2();
    }

    @Override
    public String toString() {
        return "Multiplicacion{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';

    }
}