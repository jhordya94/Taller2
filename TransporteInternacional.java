/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class TransporteInternacional {
   public static void main(String[] args) {
      // Definimos los costos por zona en un arreglo
      double[] costos = {24.00, 20.00, 21.00, 10.00, 18.00};
      
      // Pedimos al usuario que ingrese el peso del paquete en kilogramos
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el peso del paquete en kilogramos: ");
      int peso = sc.nextInt();
      
      // Verificamos si el peso del paquete es mayor a 5 kg
      if (peso > 5) {
         System.out.println("El paquete no puede ser transportado por razones de logística y seguridad.");
      } else {
         // Pedimos al usuario que ingrese la zona de destino
         System.out.println("Ingrese la zona de destino (1 = América del Norte, 2 = América Central, 3 = América del Sur, 4 = Europa, 5 = Asia): ");
         int zona = sc.nextInt();
         
         // Verificamos si la zona de destino es válida
         if (zona < 1 || zona > 5) {
            System.out.println("Zona de destino inválida.");
         } else {
            // Calculamos el costo de envío y lo mostramos por pantalla
            double costoEnvio = peso * costos[zona-1];
            System.out.println("El costo de envío es de " + costoEnvio + " euros.");
         }
      }
   }
}


