
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class mayorIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println(a + " es el numero mayor que " + b);
        }
        if (a == b) {
            System.out.println(a + " es Igual que " + b);

        } else {
            System.out.println(b + " es mayor que " + a);
        }
    }

}
