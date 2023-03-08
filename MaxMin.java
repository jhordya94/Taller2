/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] numeros = new int[10];
        
        // Pedimos los 10 números por teclado y actualizamos el máximo y mínimo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        
        // Mostramos los números junto con "máximo" o "mínimo" según corresponda
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == max) {
                System.out.println(numeros[i] + " máximo\n");
            } else if (numeros[i] == min) {
                System.out.println(numeros[i] + " mínimo\n");
            } else {
                System.out.println(numeros[i] + "\n");
            }
        }
    }

}
