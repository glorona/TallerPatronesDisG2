/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author glorona
 */
public class WAppDecorator extends NotificationDecorator {
    public WAppDecorator(Notification envoltorio){
        super(envoltorio);
    }
    
    @Override
    public void enviar(String message) {
        System.out.println("Enviando mensaje por Whatsapp");
    }
}
