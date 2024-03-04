package org.example.ListaDobleEnlazada;


/*
Diseña e implementa un sistema de gestión de estudiantes para una universidad utilizando una lista doblemente enlazada. Cada estudiante estará representado por su nombre, edad y promedio de calificaciones. El sistema debe permitir las siguientes funcionalidades:

Agregar Estudiante: Permite añadir un nuevo estudiante a la lista.
Al agregar un estudiante, el sistema debe solicitar al usuario que ingrese
el nombre, la edad y el promedio de calificaciones del estudiante.

Buscar Estudiante: Permite buscar un estudiante en la lista por su nombre. Si se encuentra,
se debe mostrar en pantalla la información del estudiante (nombre, edad y promedio de calificaciones).
Si no se encuentra, se debe mostrar un mensaje indicando que el estudiante no está en la lista.

Eliminar Estudiante:
Permite eliminar un estudiante
de la lista según su nombre.
Si el estudiante no existe en la lista, se debe mostrar un mensaje indicando que el estudiante no está en la lista.

Mostrar Estudiantes: Muestra en pantalla la información de todos los estudiantes
en la lista, incluyendo su nombre, edad y promedio de calificaciones.

Implementa clases separadas para representar un estudiante y un nodo de la lista doblemente enlazada.
La clase de la lista doblemente enlazada debe tener métodos para las operaciones mencionadas anteriormente.*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEstudiantes lista = new GestionEstudiantes();
        int opcion;
        do {
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Mostrar Estudiantes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el promedio de calificaciones del estudiante: ");
                    double promedio = scanner.nextDouble();
                    lista.agregarEstudiante(nombre, edad, promedio);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    lista.buscarEstudiante(nombreBusqueda);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del estudiante a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    lista.eliminarEstudiante(nombreEliminar);
                    break;
                case 4:
                    lista.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
}