/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un caracter o espacio para terminar:");
        char caracter;

        do {
            caracter = input.nextLine().charAt(0);

            if (Character.isWhitespace(caracter)) {
                break;
            }

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                    || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        } while (true);
    }
}

