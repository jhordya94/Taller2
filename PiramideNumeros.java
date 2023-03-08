/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Ingrese la cantidad de filas de la pirámide: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Espacios en blanco
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Lado izquierdo de la pirámide
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Lado derecho de la pirámide
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Nueva línea
        }
    }
}

