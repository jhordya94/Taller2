/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limiteInferior, limiteSuperior;
        do {
            System.out.println("Introduce el límite inferior: ");
            limiteInferior = input.nextInt();
            System.out.println("Introduce el límite superior: ");
            limiteSuperior = input.nextInt();

            if (limiteInferior > limiteSuperior) {
                System.out.println("El límite inferior debe ser menor o igual al límite superior. Vuelve a intentarlo.");
            }
        } while (limiteInferior > limiteSuperior);

        int suma = 0;
        int cantidadDentroIntervalo = 0;
        int cantidadFueraIntervalo = 0;
        boolean hayNumerosEnLimites = false;

        System.out.println("Introduce números, o 0 para terminar:");
        int numero;
        do {
            numero = input.nextInt();

            if (numero > limiteInferior && numero < limiteSuperior) {
                suma += numero;
                cantidadDentroIntervalo++;
            } else if (numero == limiteInferior || numero == limiteSuperior) {
                hayNumerosEnLimites = true;
            } else if (numero != 0) {
                cantidadFueraIntervalo++;
            }
        } while (numero != 0);

        System.out.println("La suma de los números dentro del intervalo es: " + suma);
        System.out.println("Cantidad de números fuera del intervalo: " + cantidadFueraIntervalo);
        System.out.println("¿Se introdujo algún número igual a los límites del intervalo? " + hayNumerosEnLimites);
    }
}

