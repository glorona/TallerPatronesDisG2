/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author glorona
 */
public class LegacySys {
    
    public LegacySys(){
        
    }
    
    public void pago(){
        System.out.println("Realizando pago...");
    }
    
    public void consulta(String parametro, String valorbusqueda){
        System.out.println("El valor de la consulta es:" + valorbusqueda);
        
    }
    
    public void consultaTarjetas(Cliente c){
        System.out.println("Su tipo de tarjeta es" + c.getTypeCard());
 
    }
    
}
