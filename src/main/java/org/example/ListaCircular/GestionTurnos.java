package org.example.ListaCircular;

public class GestionTurnos {


        private Nodo inicio;
        private Nodo fin;

        public GestionTurnos() {
            this.inicio = null;
            this.fin = null;
        }

        public void agregarTurno(int numero, String mascota) {
            Turno nuevoTurno = new Turno(numero, mascota);
            Nodo nuevoNodo = new Nodo(nuevoTurno);
            if (inicio == null) {
                inicio = nuevoNodo;
                fin = nuevoNodo;
                fin.siguiente = inicio;
            } else {
                fin.siguiente = nuevoNodo;
                nuevoNodo.siguiente = inicio;
                fin = nuevoNodo;
            }
        }

        public void atenderSiguienteTurno() {
            if (inicio == null) {
                System.out.println("No hay turnos en espera.");
            } else if (inicio == fin) {
                System.out.println("Turno atendido: " + inicio.turno);
                inicio = null;
                fin = null;
            } else {
                System.out.println("Turno atendido: " + inicio.turno);
                inicio = inicio.siguiente;
                fin.siguiente = inicio;
            }
        }

        public void mostrarTurnosEnEspera() {
            if (inicio == null) {
                System.out.println("No hay turnos en espera.");
            } else {
                Nodo current = inicio;
                do {
                    System.out.println(current.turno);
                    current = current.siguiente;
                } while (current != inicio);
            }
        }
    }

