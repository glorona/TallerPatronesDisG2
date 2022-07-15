/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Base.Facade;

/**
 *
 * @author glorona
 */
public class AppTelef implements Application,Voice {
    String[] intvoice = new String[4];
    Facade fac = null;


    @Override
    public Facade conectaFacade() {
      Facade fac = new Facade();
      return fac;
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
