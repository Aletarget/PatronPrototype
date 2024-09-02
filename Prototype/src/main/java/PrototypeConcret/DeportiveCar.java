/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypeConcret;

/**
 *
 * @author DEVIN ALZATE
 */
public class DeportiveCar extends Prototype.PrototypeCar{
    public static DeportiveCar inst;
    private String frenos;
    
    public DeportiveCar(String motor, String llantas, String tipo, String frenos) {
        super(motor, llantas, tipo);
        this.frenos = frenos;
    }

    public String getFrenos() {
        return frenos;
    }
}
