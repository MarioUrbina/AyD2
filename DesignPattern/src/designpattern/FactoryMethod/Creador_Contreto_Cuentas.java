/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FactoryMethod;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Creador_Contreto_Cuentas extends CreadorCuentas{    
    
    @Override
    public ICuenta crear_cuenta(String nombre,Tipo tipo_cuenta) {
        
        ICuenta cuenta_creada;
        
        
        switch( tipo_cuenta ){
            
            case AHORRO:
                cuenta_creada = new Cuenta_Ahorro(nombre);
                JOptionPane.showMessageDialog(null, "Se a creado la cuenta: " + nombre + "\nTipo: AHORRO");
                break;
                
            case MONETARIA:
                cuenta_creada = new Cuenta_Monetaria(nombre);
                JOptionPane.showMessageDialog(null, "Se a creado la cuenta: " + nombre + "\nTipo: MONETARIA");
                break;
            
            default:
                cuenta_creada = null;
        }
        
        return cuenta_creada;
    }
    
}
