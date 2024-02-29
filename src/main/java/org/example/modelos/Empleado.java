package org.example.modelos;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularBonificacion() {
        return 0.0;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}