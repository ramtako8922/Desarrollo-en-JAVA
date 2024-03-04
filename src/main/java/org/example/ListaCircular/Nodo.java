package org.example.ListaCircular;

public class Nodo {
    Turno turno;
    Nodo siguiente;

    public Nodo(Turno turno) {
        this.turno = turno;
        this.siguiente = null;
    }
}
