/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Base;

import java.util.Scanner;

/**
 *
 * @author glorona
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Creando nueva notificacion");
        Notification noti = new MensajeNotification("Notificacion");
        noti = new SMSNot(noti);
        noti = new EmailNot(noti); //se agregan los dos obligatorios
        boolean confirmacion = false;
        Scanner sc = new Scanner(System.in);
        while(confirmacion){
        System.out.println("Ingrese notificaciones opcionales a recibir, cuando ya no quiera agregar mas, ingrese volver :");
        String valor = sc.nextLine();
        
        if(valor.equals("volver")){
            confirmacion=true;
        }
        if(valor.equals("whatsapp")){
            noti = new WAppDecorator(noti);
        }
        if(valor.equals("signal")){
            noti = new SignalDecorator(noti);
        }
        if(valor.equals("telegram")){
            noti = new TelegramDecorator(noti);
         
        }
        if(valor.equals("wire")){
            noti = new WireDecorator(noti);
        }
        }
        
        
        
        
    }
}
