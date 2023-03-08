/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = sc.nextInt();

        // Verificamos si el año es divisible por 4 pero no por 100
        // o si es divisible por 400
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
    }
}

