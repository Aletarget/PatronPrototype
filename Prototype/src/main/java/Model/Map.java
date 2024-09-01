/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import Prototype.PrototypeCar;
import PrototypeConcret.DeportiveCar;
import PrototypeConcret.TransportCar;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVIN ALZATE
 */
public class Map {
    private HashMap<String, PrototypeCar> lista = new HashMap<String, PrototypeCar>();
    
    public Map(String tipoCarro) {
        if (tipoCarro.equals("Deportivo")){
            DeportiveCar deportivo = DeportiveCar.getInstancia();
            lista.put("Deportivo", deportivo);
        }else if (tipoCarro.equals("Transporte")){
            TransportCar transporte = TransportCar.getInstancia();
            lista.put("Transporte", transporte);
        }
    }
    
    public Object carro(String tipo) throws CloneNotSupportedException {
        return lista.get(tipo).clone();
    }
    
    
}
