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
        if (tipoCarro == "Deportivo"){
            DeportiveCar deportivo = new DeportiveCar("motorFull", "veloces", "Aerodinamo", "ABS");
            lista.put("DeportiveCar", deportivo);
            System.out.println("me crearon deportivo");
            JOptionPane.showMessageDialog(null, "Tipo moto: " + deportivo.getMotor() + " y tipo de freno: " +deportivo.getFrenos());
            
        }else if (tipoCarro == "Transporte"){
            TransportCar transporte = new TransportCar("asd","q12qsada" , "asdasd", "asds");
            lista.put("TransportCar", transporte);
        }
    }
    
    
    
    
}
