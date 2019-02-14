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
public abstract class CreadorCuentas {
        public static enum Tipo{
            MONETARIA,
            AHORRO
        };

        public abstract ICuenta crear_cuenta(Tipo tipo_cuenta);
               
}
