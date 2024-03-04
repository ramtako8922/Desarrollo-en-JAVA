package org.example.ListaCircular;

import java.util.Scanner;


/*
Diseña e implementa una cola circular que represente
los turnos de atención en una clínica veterinaria.
Cada turno estará representado por un número de turno
y el nombre de la mascota. Implementa las siguientes funciones:

Agregar Turno:
Permite añadir un nuevo turno a la cola.
 Al agregar un turno, el sistema debe solicitar al usuario que
 ingrese el número de turno y el nombre de la mascota.

Atender Siguiente Turno:
Permite atender el siguiente turno de la cola.
El turno atendido debe ser eliminado de la cola.

Mostrar Turnos en Espera:
Muestra en pantalla el número y nombre de las mascotas de los turnos que están en espera.

Utiliza una lista circular para implementar la cola de turnos. La lista debe contener un nodo para cada turno, con referencias al siguiente y anterior en la cola.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionTurnos cola = new GestionTurnos();
        int opcion;
        do {
            System.out.println("1. Agregar Turno");
            System.out.println("2. Atender Siguiente Turno");
            System.out.println("3. Mostrar Turnos en Espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de turno: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el nombre de la mascota: ");
                    String mascota = scanner.nextLine();
                    cola.agregarTurno(numero, mascota);
                    break;
                case 2:
                    cola.atenderSiguienteTurno();
                    break;
                case 3:
                    cola.mostrarTurnosEnEspera();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}
