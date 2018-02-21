package Interface;

import javax.ejb.Local;



/**
 *
 * @author Administrador
 */
@Local
public interface iva_interface {
    public double calcularIva(double num);
}

