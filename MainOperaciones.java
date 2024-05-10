import java.util.Scanner;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner opera = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("Ingrese el primer número:");
            double num1 = opera.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double num2 = opera.nextDouble();

            System.out.println("Ingrese la operación a realizar (suma, resta, multiplicación, división):");
            String operacion = opera.next();

            Operaciones operaciones = new Operaciones();
            operaciones.setNum1(num1);
            operaciones.setNum2(num2);

            double resultado = 0.0;

            switch (operacion) {
                case "suma":
                    Suma suma = new Suma();
                    suma.setNum1(num1);
                    suma.setNum2(num2);
                    resultado = suma.sumar();
                    break;
                case "resta":
                    Resta resta = new Resta();
                    resta.setNum1(num1);
                    resta.setNum2(num2);
                    resultado = resta.restar();
                    break;
                case "multiplicacion":
                    Multiplicacion multiplicacion = new Multiplicacion();
                    multiplicacion.setNum1(num1);
                    multiplicacion.setNum2(num2);
                    resultado = multiplicacion.multiplicar();
                    break;
                case "division":
                    Division division = new Division();
                    division.setNum1(num1);
                    division.setNum2(num2);
                    resultado = division.dividir();
                    break;
                case "salir":
                    continuar = false;
                    break;
                default:
                    System.out.println("Operación no válida.");
                    break;
            }

            if (!operacion.equals("salir")) {
                System.out.println("Resultado de la operación " + operacion + ": " + resultado);
            }

        } while (continuar);

        opera.close();
        System.out.println("¡Hasta luego!");
    }
}