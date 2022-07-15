/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package glorona.solutionproblemds;

import glorona.solutionproblemds.Tarjetas.Tarjeta;

/**
 *
 * @author glorona
 */
public abstract class Factory {
    
    public Factory(){
        
    }
    public abstract Tarjeta creaTarjetas(double costoan, double limCred);
}
