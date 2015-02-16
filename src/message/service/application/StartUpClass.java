
package message.service.application;


public class StartUpClass {

    
    public static void main(String[] args) {
        
        MessageService myMsg = new MessageService((new preProgrammedQuoteInput()) , (new GUIOutput()));
        myMsg.sendMessage();

    }
    
    
}
