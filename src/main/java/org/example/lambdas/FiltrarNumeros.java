package org.example.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNumeros {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        List<Integer> numerosFiltradosYDuplicados = numeros.stream()// Recorrer cada nodo de lista
                .filter(numero -> numero % 2 == 0) // Filtrar números pares
                //eesta función me genera un duplicado lista teniendo en cuenta la operación que yo le aplique a cada elemento
                .map(numero -> numero * 2) // Duplicar los números pares
                .toList(); // Recolectar en una lista

        // Mostrar el resultado
        System.out.println("Números pares duplicados: " + numerosFiltradosYDuplicados);
    }
}
