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
public class TarjetaPremiumFactory extends Factory {
    
    public TarjetaPremiumFactory(){
        super();
    }
    
    @Override
    public Tarjeta creaTarjetas(double costoa,double limCred){
        Tarjeta tar = new TarjetaPremium(costoa,limCred);
        return tar;
    }
}
