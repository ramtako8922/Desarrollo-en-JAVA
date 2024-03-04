package org.example.modelos;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}