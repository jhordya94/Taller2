/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class LetraMayuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        String letra = sc.nextLine();
        
        if(letra.length() == 1 && Character.isUpperCase(letra.charAt(0))) {
            System.out.println(letra + " es una letra mayúscula.");
        } else {
            System.out.println(letra + " no es una letra mayúscula.");
        }
        
        
    }
}

