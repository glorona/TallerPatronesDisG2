/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base;

/**
 *
 * @author glorona
 */
public class TelegramDecorator extends NotificationDecorator{
    
    public TelegramDecorator(Notification envoltorio){
        super(envoltorio);
    }
    
    @Override
    public void enviar(String message) {
        System.out.println("Enviando mensaje por telegram");
    }
    
}
