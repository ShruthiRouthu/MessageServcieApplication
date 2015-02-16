
package message.service.application;
import java.util.Random;

public class preProgrammedQuoteInput implements InboundStrategy {
    
    private String[] quote = {"I don’t want to earn my living; I want to live. ", 
            "Life must be lived forwards, but can only be understood backwards.",
            "Life shrinks or expands in proportion to one’s courage."};

    Random  randomNumbers = new Random();
    private int index = randomNumbers.nextInt(3);
    
    @Override
    public String getInboundMessage(){
        return quote[index];
    }
 
}
