/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class AceptacionSolicitud {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        double nota = sc.nextDouble();
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce el sexo (M o F): ");
        char sexo = sc.next().charAt(0);

        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }

    }
}
