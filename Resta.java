 public class Resta extends Operaciones {
    public double restar() {
        return getNum1() - getNum2();
    }

    @Override
    public String toString() {
        return "Resta{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}
