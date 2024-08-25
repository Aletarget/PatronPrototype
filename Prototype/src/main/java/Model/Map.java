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
    
    public void crearMap(String tipoCarro) {
        DeportiveCar deportivo = new DeportiveCar("motorFull", "veloces", "Aerodinamo", "ABS");
        TransportCar transporte = new TransportCar("asd","q12qsada" , "asdasd", "asds");
        if (tipoCarro == "Deportivo"){
            
            lista.put("DeportiveCar", deportivo);
            
        }else if (tipoCarro == "Transporte"){
            
            lista.put("TransportCar", transporte);
        }
    }
    
    public Object carro(String tipo) throws CloneNotSupportedException {
        return lista.get(tipo).clone();
    }
    
    
}
