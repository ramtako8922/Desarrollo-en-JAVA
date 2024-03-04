package org.example.ListaCircular;

public class Turno {

        private int numero;
        private String mascota;

        public Turno(int numero, String mascota) {
            this.numero = numero;
            this.mascota = mascota;
        }

        public int getNumero() {
            return numero;
        }

        public String getMascota() {
            return mascota;
        }

        @Override
        public String toString() {
            return "Turno{" +
                    "numero=" + numero +
                    ", mascota='" + mascota + '\'' +
                    '}';
        }
    }

