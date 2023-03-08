/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class NumerosPositivosNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números a introducir: ");
        int cantidadNumeros = input.nextInt();
        int numerosPositivos = 0;
        int numerosNegativos = 0;
        int numerosIgualesCero = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Introduce el número #" + (i + 1) + ": ");
            int numero = input.nextInt();

            if (numero > 0) {
                numerosPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            } else {
                numerosIgualesCero++;
            }
        }

        System.out.println("Cantidad de números positivos: " + numerosPositivos);
        System.out.println("Cantidad de números negativos: " + numerosNegativos);
        System.out.println("Cantidad de números iguales a cero: " + numerosIgualesCero);
    }
}

