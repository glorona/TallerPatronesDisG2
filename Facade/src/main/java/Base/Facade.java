/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author glorona
 */
public class Facade {
    
    LegacySys lsy;
    
    public LegacySys connectSys(){
        lsy = new LegacySys();
        
        return lsy;
        
    }
    
    public void pagaTarjeta(){
        lsy.pago();
        
    }
    
    public void consulta(String param, String val){
        lsy.consulta(param, val);
    }
    
    public void consultaT(Cliente c){
        lsy.consultaTarjetas(c);
        
    }
    
    
}
