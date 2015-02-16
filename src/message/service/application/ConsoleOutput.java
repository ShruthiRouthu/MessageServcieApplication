/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.service.application;

/**
 *
 * @author Professional
 */
public class ConsoleOutput implements OutboundStrategy {

    @Override
    public void outputMessage(String msg) {
        System.out.println(msg);
        
    }
    
}
