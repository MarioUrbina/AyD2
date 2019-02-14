/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FactoryMethod;

import StateMethod.Congelada;
import StateMethod.EstadoCuenta;
import StateMethod.Habilitada;

/**
 *
 * @author Daniel
 */
public class Cuenta_Monetaria implements ICuenta{

    EstadoCuenta estado;

    public Cuenta_Monetaria() {
        estado = new Habilitada();
    }
    
    
    
    
    @Override
    public boolean transferir(String num_cuenta, double monto) {
        System.out.println("La transferencia se realiza desde una cuenta de monetaria...");
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
    
}
