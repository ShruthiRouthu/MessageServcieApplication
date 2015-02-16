
package message.service.application;
import java.util.Scanner;

public class ConsoleInput implements InboundStrategy{
    
    Scanner keyboard = new Scanner(System.in);
    String message;
    
    @Override
    public String getInboundMessage() {
        
        //Reading message from console 
        System.out.println("Please enter your message: ");
        
        message = keyboard.nextLine();
        
        //validating message
//        while(message.isEmpty())
//        {
//            System.out.println("Invalid message!");
//            System.out.println("Please enter your message.");
//            message = keyboard.nextLine();
//        }
            
        return message; 
    }
    
    
}
