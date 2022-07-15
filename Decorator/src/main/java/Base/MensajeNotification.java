/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author glorona
 */
public class MensajeNotification implements Notification {
    
    public String notifier;
    
    public MensajeNotification(String noti){
        this.notifier = noti;
    }
    
    @Override
    public void enviar(String message) {
        System.out.println("Enviando mensaje");
    }
    
    
    
}
