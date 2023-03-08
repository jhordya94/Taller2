/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CobroLlamada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracion, hora, impuesto;
        double costo;

        // Solicitamos la duración de la llamada y la hora
        System.out.println("Ingrese la duración de la llamada (en minutos): ");
        duracion = sc.nextInt();

        System.out.println("Ingrese la hora de la llamada (en formato 24 horas): ");
        hora = sc.nextInt();

        // Calculamos el costo de la llamada en función de la duración
        if (duracion <= 5) {
            costo = 1.0;
        } else if (duracion <= 8) {
            costo = 1.0 + 0.8 * (duracion - 5);
        } else if (duracion <= 10) {
            costo = 1.0 + 0.8 * 3 + 0.7 * (duracion - 8);
        } else {
            costo = 1.0 + 0.8 * 3 + 0.7 * 2 + 0.5 * (duracion - 10);
        }

        // Calculamos el impuesto en función del día y la hora
        if (hora >= 6 && hora <= 14) {
            impuesto = 15;
        } else if (hora >= 15 && hora <= 20) {
            impuesto = 10;
        } else if (hora >= 21 || hora <= 5) {
            impuesto = 3;
        } else {
            impuesto = 0;
        }

        // Aplicamos el impuesto al costo de la llamada
        costo *= 1 + impuesto / 100.0;

        // Mostramos los resultados
        System.out.printf("El costo de la llamada es de %.2f euros.%n", costo);
        System.out.printf("El impuesto aplicado es del %d%%.%n", impuesto);
    }
}
