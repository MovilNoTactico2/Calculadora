import java.util.Scanner;

public class Calculadora {
   
    public static int sumar(int a, int b) {
        System.out.println("El resultado es: ");
        return a + b;
    }

    public static int restar(int a, int b) {
        System.out.println("El resultado es: ");
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        System.out.println("El resultado es: ");
        return a * b;
    }

    public static double dividir(int a, int b) {
        System.out.println("El resultado es: ");
        if (b == 0) {
            System.out.println("Error");
            throw new ArithmeticException();
        }
        return (double) a / b;
    }

    public static double calculadora(int a, int b, int opcion) {
        switch (opcion) {
            case 1:
                return sumar(a, b);
            case 2:
                return restar(a, b);
            case 3:
                return multiplicar(a, b);
            case 4:
                return dividir(a, b);
            default:
                System.out.println("Opcion no valida");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("--- Calculadora ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opcion: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        try {
            double resultado = calculadora(num1, num2, opcion);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}