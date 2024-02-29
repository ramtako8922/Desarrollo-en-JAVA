package org.example.genericos;

import java.util.ArrayList;
import java.util.List;
public class ListaGenerica<T> {
    private List<T> elementos;

    public ListaGenerica() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(T elemento) {
        elementos.remove(elemento);
    }

    public void mostrarElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
