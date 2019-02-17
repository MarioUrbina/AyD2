/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateMethod;

import designpattern.FactoryMethod.ICuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Congelada implements EstadoCuenta{

    @Override
    public void Transferir(ICuenta cuenta) {
        //System.out.println("Transacción denegada, congelada!");
        JOptionPane.showMessageDialog(null, "Su transaccion ha sido denegada,por lo que hemos congelado su cuenta");

    }
    
}
