/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class NumerosInversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Pedir 10 números y guardarlos en un array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("Los números en orden inverso son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
