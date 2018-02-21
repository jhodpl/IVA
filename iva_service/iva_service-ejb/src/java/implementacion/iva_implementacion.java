package implementacion;

import Interface.iva_interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class iva_implementacion implements iva_interface{

    @Override
    public double calcularIva(double num) {
        return (num * 0.19);
    }
    
}
