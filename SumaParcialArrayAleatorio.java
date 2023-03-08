/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Random;

public class SumaParcialArrayAleatorio {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        Random rand = new Random();

        // Llenar el array con números aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = rand.nextInt(900) + 100;
            }
        }

        // Mostrar el array y calcular las sumas parciales
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + "\t");
                sumaFila += array[i][j];
                sumaTotal += array[i][j];
            }
            System.out.println("| " + sumaFila);
        }

        // Mostrar las sumas parciales de las columnas y la suma total
        for (int j = 0; j < 5; j++) {
            System.out.print("______\t");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += array[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }
        System.out.println("| " + sumaTotal);
    }
}

