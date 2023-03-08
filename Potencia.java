/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();
        
        double resultado = 1.0;
        
        if(exponente > 0) {
            for(int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
        } else if(exponente == 0) {
            System.out.println(base + " elevado a " + exponente + " es igual a 1");
        } else {
            exponente = -exponente;
            for(int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            resultado = 1.0 / resultado;
            System.out.println(base + " elevado a " + (-exponente) + " es igual a " + resultado);
        }
        
        
    }
}

