package org.example.modelos;

import org.example.modelos.interfaces.Calculadora;
import org.example.modelos.interfaces.Volador;

class Perro {
    public void moverse() {
        System.out.println("El perro se mueve");
    }
}

public class Pajaro {
    public void volar2() {
        System.out.println("El pájaro vuela");
    }
}

// Esta clase no puede heredar de Perro y Pajaro directamente
class PerroVolador extends Pajaro implements Volador, Calculadora {
    @Override
    public void volar() {
        System.out.println(" soy un perrito que vuela");

        }

    public void sumar() {
        int a=5;
        int b=6;
        int res=a+b;
        System.out.println(res);


    }

    @Override
    public void volar2() {
        super.volar2();
    }

    public static void main(String[] args) {
        PerroVolador perroVolador=new PerroVolador();
        perroVolador.volar();
        perroVolador.volar2();
        perroVolador.sumar();
    }




}
