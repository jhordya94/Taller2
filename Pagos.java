/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Pagos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer pago: ");
        double primerPago = input.nextDouble();

        System.out.println("Introduce el incremento porcentual mensual: ");
        double incrementoPorcentual = input.nextDouble();

        double pagoMensual = primerPago;
        double totalPagado = primerPago;

        for (int i = 2; i <= 20; i++) {
            pagoMensual *= (1 + incrementoPorcentual / 100);
            totalPagado += pagoMensual;
        }

        System.out.println("El pago mensual es: " + pagoMensual);
        System.out.println("El total pagado después de los 20 meses es: " + totalPagado);
    }
}

