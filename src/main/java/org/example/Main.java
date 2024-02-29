package org.example;

import org.example.modelos.EmpleadoBase;
import org.example.modelos.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Juan", 5000, 0.2);
        EmpleadoBase empleadoBase = new EmpleadoBase("Pedro", 3000);

        System.out.println("Bonificación del gerente: " + gerente.calcularBonificacion());
        System.out.println("Bonificación del empleado base: " + empleadoBase.calcularBonificacion());
    }
}