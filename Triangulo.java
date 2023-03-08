/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los lados del triángulo: ");

        // Pedimos el tamaño de los lados del triángulo
        System.out.println("Lado A: ");
        double ladoA = sc.nextDouble();
        System.out.println("Lado B: ");
        double ladoB = sc.nextDouble();
        System.out.println("Lado C: ");
        double ladoC = sc.nextDouble();

        // Verificamos si el triángulo es equilátero
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("El triángulo es equilátero");
        }
        // Verificamos si el triángulo es isósceles
        else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("El triángulo es isósceles");
        }
        // Verificamos si el triángulo es rectángulo
        else if (ladoA * ladoA + ladoB * ladoB == ladoC * ladoC ||
                 ladoA * ladoA + ladoC * ladoC == ladoB * ladoB ||
                 ladoB * ladoB + ladoC * ladoC == ladoA * ladoA) {
            System.out.println("El triángulo es rectángulo");
        }
        // Si no es ninguno de los anteriores, entonces es escaleno
        else {
            System.out.println("El triángulo es escaleno");
        }
    }
}

