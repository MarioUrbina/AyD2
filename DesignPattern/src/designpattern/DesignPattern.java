/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.FactoryMethod.CreadorCuentas;
import designpattern.FactoryMethod.Creador_Contreto_Cuentas;
import designpattern.FactoryMethod.ICuenta;

/**
 *
 * @author Daniel
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CreadorCuentas creador = new Creador_Contreto_Cuentas();
        
        ICuenta cuenta_monetaria = creador.crear_cuenta("1",CreadorCuentas.Tipo.MONETARIA);
        
        ICuenta cuenta_ahorro = creador.crear_cuenta("2",CreadorCuentas.Tipo.AHORRO);
        
        Transferencias t = new Transferencias(cuenta_monetaria);
        
        t.show();
        
        /*cuenta_monetaria.transferir("100001", 101010);
        
        cuenta_ahorro.transferir("737373", 102939);*/
        
    }
    
}
