/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.hotelampaignconsumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 *
 * @author yakos
 */
@EnableBinding(Sink.class)
public class CampaignConsumer {
    
    @StreamListener(Sink.INPUT)
    public void log(Campaign cmp){
        System.out.println("Campaign contains id as " + cmp.toString());
    }
    
}
