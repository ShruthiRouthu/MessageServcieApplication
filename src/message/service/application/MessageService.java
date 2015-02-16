
package message.service.application;

public class MessageService {
    
    // properties to hold required strategy objects (using Liskov's substitution principle)
    private InboundStrategy inputObject;
    private OutboundStrategy outputObject;

    public MessageService(InboundStrategy inputObject, OutboundStrategy outputObject) {
        this.inputObject = inputObject;
        this.outputObject = outputObject;
    }
    
    public void sendMessage()
    {
        String msg = inputObject.getInboundMessage();
        outputObject.outputMessage(msg);
    }
    
}
