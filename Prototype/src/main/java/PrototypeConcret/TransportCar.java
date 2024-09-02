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
    
    private TransportCar(String motor, String llantas, String tipo, String suspension) {
        super(motor, llantas, tipo);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }
}
