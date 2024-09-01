/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypeConcret;

/**
 *
 * @author DEVIN ALZATE
 */
public class TransportCar extends Prototype.PrototypeCar{
    private static TransportCar inst;
    private String suspension;

    public static TransportCar getInstancia(){
            if(inst==null){
           inst = new TransportCar("pruebas:D", "pruebas:D", "pruebas:D", "pruebas:D");
       }
       return inst;
    }
    
    public TransportCar(String motor, String llantas, String tipo, String suspension) {
        super(motor, llantas, tipo);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
}
