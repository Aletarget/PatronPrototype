/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.Map;
import Prototype.PrototypeCar;
import PrototypeConcret.DeportiveCar;
import PrototypeConcret.TransportCar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEVIN ALZATE
 */
public class Ventana extends JFrame{
    private Map mapa;
    public Ventana() {
        
        // Configurar el JFrame
        setTitle("Car Selector");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titulo = new JLabel("Ingrese que tipo de carro desea \n Deportivo ó de Transporte");
        titulo.setBounds(20, 10, 380, 30);
        add(titulo);
        
        JTextField texto = new JTextField();
        texto.setBounds(100, 50, 180, 20);
        add(texto);
        
        JButton boton = new JButton("Generar");
        boton.setBounds(140, 90, 100, 20);
        add(boton);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                try {
                    String tipoCarro = texto.getText();
                    System.out.println(tipoCarro);
                    Map carp = Map.getInstance(tipoCarro);
                    TransportCar carT = (TransportCar) carp.carro(tipoCarro);
                    DeportiveCar carD = (DeportiveCar) carp.carro(tipoCarro);
                    
                    if (tipoCarro.equals("Deportivo")) {
                        JOptionPane.showMessageDialog(null, "Se ha clonado un objeto de tipo DeportiveCar:\nMotor: "+carD.getMotor()+"\nLlantas: "+carD.getLlantas()+"\nTipo: "+carD.getTipo()+
                                    "\nFrenos: "+carD.getFrenos()+"\nObjeto: "+carD);
                        
                        
                    }else if(tipoCarro.equals("Transporte")){
                    JOptionPane.showMessageDialog(null, "Se ha clonado un objeto de tipo TransportCar:\nMotor: "+carT.getMotor()+"\nLlantas: "+carT.getLlantas()+"\nTipo: "+carT.getTipo()+
                                    "\nSuspension: "+carT.getSuspension()+"\nObjeto: "+carT);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Entrada no valida, intente denuevo");
                    }
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }   
            });
    }
}
