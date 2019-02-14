/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateMethod;

import designpattern.FactoryMethod.ICuenta;

/**
 *
 * @author Daniel
 */
public interface EstadoCuenta {
    
    public void Transferir(ICuenta cuenta);
    
}
