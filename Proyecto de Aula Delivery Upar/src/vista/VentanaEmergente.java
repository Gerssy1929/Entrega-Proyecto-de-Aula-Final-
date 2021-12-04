/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author German
 */
public class VentanaEmergente {
    public static void mostrarMsg(JInternalFrame padre, String titulo, String contenido, int icono){
        
        JOptionPane.showMessageDialog(padre, contenido, titulo, icono);
        
    }
}
