/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author DEVIN ALZATE
 */
public class Controller {
    private Map mapa = new Map();
    
    public Controller(){
        definirDatos();
    }
    
    public void definirDatos() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de carro que quiere. \n ´Deportivo´ o ´Transporte´");
        mapa.crearMap(tipo);
        JOptionPane.showMessageDialog(null, "Has creado un tipo de carro " + tipo + " con las caracteristicas: " + mapa.crearMap(tipo));
    }
}
