package org.example.genericos;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Integer> listaEnteros = new ListaGenerica<>();
        listaEnteros.agregarElemento(1);
        listaEnteros.agregarElemento(2);
        listaEnteros.agregarElemento(3);
        listaEnteros.mostrarElementos();

        ListaGenerica<String> listaStrings = new ListaGenerica<>();
        listaStrings.agregarElemento("Hola");
        listaStrings.agregarElemento("Mundo");
        listaStrings.agregarElemento("!");
        listaStrings.mostrarElementos();
    }
}
