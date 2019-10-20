/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.HotelCampaignPublisher;
import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author yakos
 */

@RestController
@EnableBinding(Source.class)
public class CampaignPublisher {
    @Autowired
    Source source;
    
    @PostMapping(value="/cmp")
    public String sendCampaign(@RequestBody String payload)
    {
        ObjectMapper ob = new ObjectMapper();
        Campaign cmp = null;
        
        try {
            cmp = ob.readValue(payload, Campaign.class);
            
            
        } catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        source.output().send(MessageBuilder.withPayload(cmp)
                .setHeader("myheader","myheaderValue").build());
        
        //System.out.println("cmp = "+ cmp);
        
        System.out.println("Successfully sent campaign to rabbitmq");
        
        return "success";   
    }   
    
    
}
