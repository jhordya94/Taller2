/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        if(num2 == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
        
        
    }
}
