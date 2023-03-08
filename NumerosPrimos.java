/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, num = 2;

        System.out.println("Ingrese la cantidad de números primos que desea mostrar: ");
        n = sc.nextInt();

        while (count < n) {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(num + " ");
                count++;
            }

            num++;
        }
    }
}

