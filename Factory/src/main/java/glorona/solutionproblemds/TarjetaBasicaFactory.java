/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package glorona.solutionproblemds;

import glorona.solutionproblemds.Tarjetas.*;

/**
 *
 * @author glorona
 */
public class TarjetaBasicaFactory extends Factory {
    
    public TarjetaBasicaFactory(){
        super();
    }
    
    @Override
    public Tarjeta creaTarjetas(double costoa,double limCred){
        Tarjeta tar = new TarjetaBasica(costoa,limCred);
        return tar;
    }
    
}
