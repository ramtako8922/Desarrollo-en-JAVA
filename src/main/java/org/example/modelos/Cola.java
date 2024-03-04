package org.example.modelos;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("Elemento 1");
        cola.add("Elemento 2");
        cola.add("Elemento 3");

        System.out.println("Cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
