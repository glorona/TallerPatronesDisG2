/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Base.Cliente;
import Base.Facade;

/**
 *
 * @author glorona
 */
public class AppWeb implements Application,Consultable,Pagable {

    Facade fac = null;

    @Override
    public Facade conectaFacade() {
      fac = new Facade();
      return fac;
    }

    @Override
    public void consultar(String param, String value) {
        fac.consulta(param, value);
       
    }

    @Override
    public void consultaT(Cliente c) {
        fac.consultaT(c);
        
    }

    @Override
    public boolean pago() {
        fac.pagaTarjeta();
        return true;
       
    }
}
