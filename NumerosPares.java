/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numero1 = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = input.nextInt();

        // Asegurarse de que numero1 sea menor o igual a numero2
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Los números pares entre " + numero1 + " y " + numero2 + " son:");

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

