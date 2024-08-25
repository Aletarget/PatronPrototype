/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import Prototype.PrototypeCar;
import PrototypeConcret.DeportiveCar;
import PrototypeConcret.TransportCar;

/**
 *
 * @author DEVIN ALZATE
 */
public class Map {
    private HashMap<String, PrototypeCar> lista = new HashMap<String, PrototypeCar>();
    
    public Map() {
        DeportiveCar deportivo = new DeportiveCar("asd", "asda", "asda", "88678");//colocar que aqui se seleccione si desea ver este carro y crearlo
        TransportCar transporte = new TransportCar("asd","q12qsada" , "asdasd", "asds");//colocar que aqui se seleccione si desea ver este carro y crearlo
        
        
        lista.put("DeportiveCar", deportivo);
        lista.put("TransportCar", transporte);
    }
}
