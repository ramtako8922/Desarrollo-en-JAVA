package org.example.modelos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Expciones {
    public static void main(String[] args) {
        String nombreArchivo = "numeros4.txt";
        int suma = 0;

        try {
            ClassLoader classLoader = Expciones.class.getClassLoader();
            File file = new File(classLoader.getResource(nombreArchivo).getFile());
            Scanner lector = new Scanner(file);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                try {
                    int numero = Integer.parseInt(linea);
                    suma += numero;
                } catch (NumberFormatException e) {
                    System.out.println("Error de formato en la línea: " + linea);
                }
            }

            lector.close();
            System.out.println("La suma de los números es: " + suma);

        } catch (Exception e) {
            System.out.println("No se pudo encontrar el archivo: " + nombreArchivo);
            e.printStackTrace();
        }
    }
}
