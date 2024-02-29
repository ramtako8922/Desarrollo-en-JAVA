package org.example.modelos;

public class EmpleadoBase extends Empleado {
    public EmpleadoBase(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        return super.getSalario() * 0.1;
    }
}