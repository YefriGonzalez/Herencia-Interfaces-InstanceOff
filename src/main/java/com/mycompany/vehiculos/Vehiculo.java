package com.mycompany.vehiculos;

import com.mycompany.interfaces.Giro;

public abstract class Vehiculo implements Giro {
    protected String combustible;
    protected int cantidadGalones;
    protected int cantidadPasajeros;
    protected double velocidadMaxima;
    protected double aceleracionBase;
    
    public Vehiculo(String combustible, int cantidadGalones, int cantidadPasajeros, double velocidadMaxima,
            double aceleracionBase) {
        this.combustible = combustible;
        this.cantidadGalones = cantidadGalones;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
    }

    public abstract void frenar();
    public abstract void acelerar();
    public abstract void apagar();
    public abstract void encender();
    public abstract void avanzar();

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getCantidadGalones() {
        return cantidadGalones;
    }

    public void setCantidadGalones(int cantidadGalones) {
        this.cantidadGalones = cantidadGalones;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }

    @Override
    public String toString() {
        return "Vehiculo [aceleracionBase=" + aceleracionBase + ", cantidadGalones=" + cantidadGalones
                + ", cantidadPasajeros=" + cantidadPasajeros + ", combustible=" + combustible + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }
    
}
