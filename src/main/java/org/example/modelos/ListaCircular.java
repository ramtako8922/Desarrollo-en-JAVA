package org.example.modelos;

import java.util.ArrayList;
import java.util.List;

public class ListaCircular<T> {
    private List<T> elementos;
    private int indiceActual;

    public ListaCircular() {
        this.elementos = new ArrayList<>();
        this.indiceActual = 0;
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public T obtenerElementoActual() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.get(indiceActual);
    }

    public T avanzar() {
        if (elementos.isEmpty()) {
            return null;
        }
        indiceActual = (indiceActual + 1) % elementos.size();
        return elementos.get(indiceActual);
    }

    public T retroceder() {
        if (elementos.isEmpty()) {
            return null;
        }
        indiceActual = (indiceActual - 1 + elementos.size()) % elementos.size();
        return elementos.get(indiceActual);
    }

    public static void main(String[] args) {
        ListaCircular<Integer> listaCircular = new ListaCircular<>();
        listaCircular.agregarElemento(1);
        listaCircular.agregarElemento(2);
        listaCircular.agregarElemento(3);

        System.out.println("Elemento actual: " + listaCircular.obtenerElementoActual());
        System.out.println("Avanzar: " + listaCircular.avanzar());
        System.out.println("Avanzar: " + listaCircular.avanzar());
        System.out.println("Retroceder: " + listaCircular.retroceder());
    }
}