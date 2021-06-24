package com.mycompany.vehiculos;


public class ManejadorVehiculos {

    public ManejadorVehiculos(){

    }
   
    public void crearVehiculo(Vehiculo[] vehiculos){
        for(int i=0;i<vehiculos.length;i++){
            dado();
            if(dado()>=10 && dado()<30){
                vehiculos[i]=new Camioneta("Diesel",dado(),60,dado(),dado());
            } else if(dado()>=30 && dado()<50){
                vehiculos[i]=new DeCarga("Gasolina", dado(),4,dado(),dado());
            } else if(dado()>=50 && dado()<=70){
                vehiculos[i]=new DeCarrera("Gasolina",dado(),2,200,100);
            }
        }
    }


    public void verVehiculo(Vehiculo[] vehiculos){
        for(int i=0;i<vehiculos.length;i++){
            if(vehiculos[i] instanceof Camioneta){
                System.out.println("Camioneta");
                System.out.println(vehiculos[i].toString());
                ((Camioneta)vehiculos[i]).trasportarPersonas();
            } else if(vehiculos[i] instanceof DeCarrera){
                System.out.println("Auto de Carrera");
                System.out.println(vehiculos[i].toString());
                ((DeCarrera)vehiculos[i]).aplicarTurbo();
                ((DeCarrera)vehiculos[i]).triplicarAceleracion();
            } else if(vehiculos[i] instanceof DeCarga){
                System.out.println("Vehiculo de Carga");
                System.out.println(vehiculos[i].toString());
                ((DeCarga)vehiculos[i]).transportarMaterial();
            }
        } 
       
    }

    public int dado(){
        int resultado=0;
        resultado=(int)(Math.random()*(70-10)+10);
        return resultado;
    }
}
