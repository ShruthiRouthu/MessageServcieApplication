
package message.service.application;
import javax.swing.JOptionPane;

public class GUIOutput implements OutboundStrategy{

    @Override
    public void outputMessage(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
}
