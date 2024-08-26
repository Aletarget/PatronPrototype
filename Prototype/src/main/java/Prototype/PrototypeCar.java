/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author DEVIN ALZATE
 */
public class PrototypeCar implements Cloneable{
    private String motor;
    private String llantas;
    private String tipo;
    
    public PrototypeCar(String motor, String llantas, String tipo){
        this.motor = motor;
        this.llantas = llantas;
        this.tipo = tipo;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getMotor() {
        return motor;
    }

    public String getLlantas() {
        return llantas;
    }

    public String getTipo() {
        return tipo;
    }

    
}
