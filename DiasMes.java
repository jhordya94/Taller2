/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        int numDias;

        // Solicitamos el número del mes
        System.out.println("Ingrese el número del mes (1 a 12): ");
        mes = sc.nextInt();

        // Verificamos el número de días del mes correspondiente
        switch (mes) {
            case 2:
                numDias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            default:
                numDias = 31;
                break;
        }

        // Mostramos el número de días del mes correspondiente
        System.out.printf("El mes %d tiene %d días.%n", mes, numDias);
    }
}

