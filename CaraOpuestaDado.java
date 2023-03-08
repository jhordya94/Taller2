/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CaraOpuestaDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado;
        String caraOpuesta;

        // Solicitamos el resultado del dado
        System.out.println("Ingrese el resultado obtenido al lanzar el dado (1 a 6): ");
        resultado = sc.nextInt();

        // Verificamos que el resultado esté en el rango correcto
        if (resultado < 1 || resultado > 6) {
            System.out.println("ERROR: número incorrecto.");
        } else {
            // Calculamos la cara opuesta en función del resultado
            switch (resultado) {
                case 1:
                    caraOpuesta = "6";
                    break;
                case 2:
                    caraOpuesta = "5";
                    break;
                case 3:
                    caraOpuesta = "4";
                    break;
                case 4:
                    caraOpuesta = "3";
                    break;
                case 5:
                    caraOpuesta = "2";
                    break;
                default:
                    caraOpuesta = "1";
                    break;
            }

            // Mostramos la cara opuesta
            System.out.printf("La cara opuesta al resultado %d es la cara %s.%n", resultado, caraOpuesta);
        }
    }
}

