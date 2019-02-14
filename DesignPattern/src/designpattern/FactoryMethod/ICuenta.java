/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.FactoryMethod;

/**
 *
 * @author Daniel
 */
public interface ICuenta {
        
    public boolean transferir(String num_cuenta, double monto);
    
    
    /**
     * Manejo de estados.
     */
    
    public void congelar_cuenta();
    
    public void habilitar_cuenta();
    
}
