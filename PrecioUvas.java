/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class PrecioUvas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de uva (A o B): ");
        String tipoUva = sc.next();
        System.out.println("Ingrese el tamaño de uva (1 o 2): ");
        int tamanoUva = sc.nextInt();
        System.out.println("Ingrese la cantidad de kilos de uva: ");
        double kilosUva = sc.nextDouble();

        // Definimos el precio inicial de la uva según su tipo
        double precioInicial;
        if (tipoUva.equals("A")) {
            precioInicial = 0.5; // Precio inicial de la uva tipo A
        } else {
            precioInicial = 0.4; // Precio inicial de la uva tipo B
        }

        // Calculamos el precio final de la uva según su tamaño
        double precioFinal;
        if (tamanoUva == 1) {
            precioFinal = precioInicial + 0.2; // Añadimos 20 céntimos al precio si es tamaño 1
        } else {
            precioFinal = precioInicial + 0.3; // Añadimos 30 céntimos al precio si es tamaño 2
        }

        // Ajustamos el precio final según el tipo de uva
        if (tipoUva.equals("A")) {
            precioFinal += precioFinal * kilosUva * 0.1; // Añadimos 10% al precio si es tipo A
        } else {
            precioFinal -= precioFinal * kilosUva * 0.1; // Restamos 10% al precio si es tipo B
        }

        // Imprimimos el precio final de la uva
        System.out.println("El precio final del embarque es: " + precioFinal * kilosUva + " euros");
    }
}

