/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class SumasParcialesArray {

    public static void main(String[] args) {
        // Crear un scanner para leer los números introducidos por teclado
        Scanner sc = new Scanner(System.in);

        // Crear el array de 4 filas y 5 columnas
        int[][] numeros = new int[4][5];

        // Leer los números y guardarlos en el array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Introduce un número para la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                numeros[i][j] = sc.nextInt();
            }
        }

        // Calcular las sumas parciales de las filas y mostrarlas
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
                System.out.println(numeros[i][j] + "\t");
            }
            System.out.println("= " + sumaFila);
        }

        // Calcular las sumas parciales de las columnas y mostrarlas
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.println("= " + sumaColumna + "\t");
        }

        // Calcular la suma total y mostrarla en la esquina inferior derecha
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }
        System.out.println("\nSuma total = " + sumaTotal);
    }
}

