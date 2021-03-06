/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FactoryMethod;

import StateMethod.Congelada;
import StateMethod.EstadoCuenta;
import StateMethod.Habilitada;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Cuenta_Monetaria implements ICuenta{

    EstadoCuenta estado;
    String nombre;

    public Cuenta_Monetaria(String nombre) {
        estado = new Habilitada();
        this.nombre = nombre;
    }    
    
    
    @Override
    public boolean transferir(String num_cuenta, double monto) {
        JOptionPane.showMessageDialog(null, "La transferencia se realiza desde una cuenta de ahorro...");
        estado.Transferir(this);
        return true;   
    }

    @Override
    public void congelar_cuenta() {
        estado = new Congelada();
    }

    @Override
    public void habilitar_cuenta() {
        estado = new Habilitada();
    }

    @Override
    public String nombre_cuenta() {
        return nombre;
    }
    
}
