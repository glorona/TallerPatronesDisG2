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
public class AppMovil implements Application, Consultable, Pagable,Voice {
    
    
    String[] intvoice = new String[4];
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

    @Override
    public void consultaVoice(String valor, String param) {
        fac.consulta(param, valor);
        
        
    }

    @Override
    public String[] interpretavoice() {
        String[] result = new String[4];
        result[0] = "Voz";
        result[1] = "Valor";
        result[2] = "Consulta";
        result[3] = "Valor";
        
        intvoice = result;
        return intvoice;
    }
    
    
}
