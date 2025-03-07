package pkg;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;

        System.out.println("Calculadora en Java");
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        switch (operador) {
            case '+':
            	 sumar(num1,num2);
                break;
                
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
			Division(num1, num2);
                break;
            default:
                System.out.println("Operador no válido.");
        }

        scanner.close();
    }

	public static void Division(double num1, double num2) {
		double resultado;
		if (num2 != 0) {
		    resultado = num1 / num2;
		    System.out.println("Resultado: " + resultado);
		} else {
		    System.out.println("Error: División por cero no permitida.");
		}
	public static void sumar(double num1, double num2) {
		var resultado = num1 + num2;
		System.out.println("Resultado: " + resultado);
	}
}
    
   
