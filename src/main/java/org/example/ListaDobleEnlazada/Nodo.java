package org.example.ListaDobleEnlazada;
public class Nodo {
    Estudiante estudiante;
    Nodo prev;
    Nodo next;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.prev = null;
        this.next = null;
    }
}
