
package message.service.application;
import javax.swing.JOptionPane;

public class GUIInput implements InboundStrategy{

    String message;
    
    @Override
    public String getInboundMessage() {
        
        String message = JOptionPane.showInputDialog("Please enter your message.");
        
        //validating message
        while(message.isEmpty())
        {
            message = JOptionPane.showInputDialog( "Invalid message!\nPlease enter your message.");
        }
            
        return message; 
        
    }
    
    
    
}
