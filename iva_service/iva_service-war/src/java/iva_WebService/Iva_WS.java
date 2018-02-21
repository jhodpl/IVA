package iva_WebService;

import Interface.iva_interface;
import implementacion.iva_implementacion;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "consumo")
public class Iva_WS {
    @EJB
    private iva_interface iva;
    
    @WebMethod(action = "calcular")
    public double consumirServicio(@WebParam(name ="valor")double num){
        iva = new iva_implementacion();
        iva.calcularIva(num);
        return iva.calcularIva(num);
    }
    

    
}