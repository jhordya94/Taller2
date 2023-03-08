/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class ViajeEstudios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos;
        double costoAlumno, costoTotal;

        // Solicitamos el número de alumnos
        System.out.println("Ingrese el número de alumnos que participarán en el viaje: ");
        numAlumnos = sc.nextInt();

        // Calculamos el costo por alumno
        if (numAlumnos >= 100) {
            costoAlumno = 65;
        } else if (numAlumnos >= 50) {
            costoAlumno = 70;
        } else if (numAlumnos >= 30) {
            costoAlumno = 95;
        } else {
            costoAlumno = 4000.0 / numAlumnos;
        }

        // Calculamos el costo total del viaje
        costoTotal = numAlumnos * costoAlumno;

        // Mostramos los resultados
        System.out.printf("El costo por alumno es de %.2f euros.%n", costoAlumno);
        System.out.printf("El costo total del viaje es de %.2f euros.%n", costoTotal);
    }
}

