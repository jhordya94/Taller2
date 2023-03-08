/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        String diaSemana;

        // Solicitamos el día de la semana
        System.out.println("Ingrese el número del día de la semana (1 a 7): ");
        dia = sc.nextInt();

        // Verificamos que el día esté en el rango correcto
        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("ERROR: número incorrecto.");
                return;
        }

        // Mostramos el día de la semana correspondiente
        System.out.printf("El número %d corresponde al día %s.%n", dia, diaSemana);
    }
}

