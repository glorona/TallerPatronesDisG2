/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Base;

import App.*;
import java.util.Scanner;

/**
 *
 * @author glorona
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plataforma de donde se conecta el usuario: ");
        String valor = sc.nextLine();
        Cliente c = new Cliente();
        if(valor.equals("movil")){
            AppMovil app = new AppMovil();
            app.conectaFacade();
            app.pago();
            app.consultaT(c);
            app.consultar("Parametro", "Valor");
            String[] resvoice = app.interpretavoice();
            app.consultaVoice(resvoice[1],resvoice[3]);
            
        }
        else if(valor.equals("web")){
            AppWeb app = new AppWeb();
            app.conectaFacade();
            app.consultaT(c);
            app.consultar("Parametro", "Valor");
            app.pago();
        }
        else{
            AppTelef app = new AppTelef();
            app.conectaFacade();
            String[] resvoice = app.interpretavoice();
            app.consultaVoice(resvoice[1],resvoice[3]);
        }
        
    }
}
