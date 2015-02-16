
package message.service.application;
import java.util.Random;

public class preProgrammedJokeInput implements InboundStrategy {
    


    private String[] joke = {"If at first you don't succeed don't try skydiving.", 
                             "I use to be addicted to the Hockey Pockey but I turned myself around."   };

    
    Random  randomNumbers = new Random();
    private int index = randomNumbers.nextInt(2);
    
    @Override
    public String getInboundMessage(){
        
        return joke[index];
    }

    
}
