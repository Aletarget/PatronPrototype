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

/**
 *
 * @author DEVIN ALZATE
 */
public class Ventana extends JFrame{
    private Map mapa;
    public Ventana() {
        mapa = new Map();
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
            public void actionPerformed(ActionEvent e) {
                // Acción que se ejecutará cuando se haga clic en el botón
                mapa.crearMap(texto.getText());
                mapa.carro(texto.getText());
            }
        });
    }
}
