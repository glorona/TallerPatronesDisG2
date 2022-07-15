/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package glorona.solutionproblemds;

import glorona.solutionproblemds.Tarjetas.Tarjeta;
import java.util.Scanner;

/**
 *
 * @author glorona
 */
public class Main {

    public static void main(String[] args) {
        Factory fac;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar consumos mensuales en la tienda: ");
        double consumomen = sc.nextDouble();
        if(consumomen>100){
            fac = new TarjetaVIPFactory();
            crearTarjeta("VIP",fac);
        }
        else if(consumomen<100 && consumomen>75){
            fac = new TarjetaPremiumFactory();
            crearTarjeta("Premium",fac);
        }
        else{
            fac = new TarjetaBasicaFactory();
            crearTarjeta("Basic",fac);
        }
        
        
       
        
    }
    
    static void crearTarjeta(String tip,Factory fac){
        double credan = 0;
        double costoa = 0;
        if(tip.equals("VIP")){
            costoa = 150;
            credan  = 1000;
        }
        if(tip.equals("Premium")){
            costoa = 100;
            credan  = 750;
        }
        if(tip.equals("Basic")){
            costoa = 150;
            credan  = 500;
        }
        
        
        Tarjeta tar = fac.creaTarjetas(costoa, credan);
        
    }
}
