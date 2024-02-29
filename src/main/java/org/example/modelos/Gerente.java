package org.example.modelos;

public class Gerente extends Empleado {
    private double bonificacion;

    public Gerente(String nombre, double salario, double bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    public double calcularBonificacion() {
        return super.getSalario() * bonificacion;
    }
}
