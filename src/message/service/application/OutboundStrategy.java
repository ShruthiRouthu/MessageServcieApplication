
package message.service.application;


public interface OutboundStrategy {
    
    public abstract void outputMessage(String msg);
    
}
