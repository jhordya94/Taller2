/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAdivinar = rand.nextInt(100) + 1;
        int intentosRestantes = 10;

        System.out.println("¡Bienvenido a Adivina el Número!");
        System.out.println("Adivina un número del 1 al 100. Tienes 10 intentos.");

        Scanner input = new Scanner(System.in);

        while (intentosRestantes > 0) {
            System.out.println("Introduce tu número: ");
            int numeroUsuario = input.nextInt();
            intentosRestantes--;

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades, has acertado en " + (10 - intentosRestantes) + " intentos!");
                return;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor. Intentos restantes: " + intentosRestantes);
            } else {
                System.out.println("El número a adivinar es menor. Intentos restantes: " + intentosRestantes);
            }
        }

        System.out.println("Lo siento, has agotado tus 10 intentos. El número a adivinar era: " + numeroAdivinar);
    }
}

