/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscurso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author asortega
 */
public class EjerciciosCurso {
    //Lecciones de la 1 a la 6 1/2 curso oracle, java new features 
    //LAMBDA
    //creamos un boton
    JButton boton = new JButton("Boton");

    public void metodoPruebas() {
        //sin lambda
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sin Lambda");
            }
        });
        //ActionListener con lambda
        boton.addActionListener((ActionEvent e) -> {
            System.out.println("Con Lambda");
        });

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
