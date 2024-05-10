public class Division extends Operaciones {
    public double dividir() {
        if (getNum2() != 0) {
            return getNum1() / getNum2();
        } else {
            System.out.println("Error: división por cero.");
            return Double.NaN;
        }
    }

    @Override
    public String toString() {
        return "Division{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}