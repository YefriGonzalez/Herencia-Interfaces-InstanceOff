package com.mycompany.vehiculos;

import com.mycompany.interfaces.TransportePersonas;


public class Camioneta extends Vehiculo implements TransportePersonas{

    public Camioneta(String combustible, int cantidadGalones, int cantidadPasajeros, double velocidadMaxima,
            double aceleracionBase) {
        super(combustible, cantidadGalones, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public void acelerar() {
        System.out.println("La camioneta esta acelerando");
        
    }

    @Override
    public void apagar() {
        System.out.println("La camioneta se apago");
        
    }

    @Override
    public void avanzar() {
        System.out.println("La camioneta esta avanzando");
        
    }

    @Override
    public void encender() {
        System.out.println("La camioneta se encendio");
        
    }

    @Override
    public void frenar() {
        System.out.println("La camioneta esta frenando");
        
    }

    public void girarIizquierda() {
        System.out.println("La camioneta esta girando a la izquierda");
        
    }

    public void girarDerecha(){
        System.out.println("La camioneta esta girando a la derecha");
    }

    public void trasportarPersonas() {
        System.out.println("Transportando Pasajeros");
        
    }

    
}
