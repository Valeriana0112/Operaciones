public class Suma extends Operaciones {
    public double sumar() {
        return getNum1() + getNum2();
    }

    @Override
    public String toString() {
        return "Suma{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}