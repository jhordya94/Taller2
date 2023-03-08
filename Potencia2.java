/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Potencia2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        double base = input.nextDouble();

        System.out.println("Introduce el exponente: ");
        int exponente = input.nextInt();

        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }
}

