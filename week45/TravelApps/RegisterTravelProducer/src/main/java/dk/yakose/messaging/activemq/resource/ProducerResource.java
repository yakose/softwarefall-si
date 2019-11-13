package dk.yakose.messaging.activemq.resource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dk.yakose.model.RequestFormular;
import java.io.IOException;
import org.springframework.jms.core.JmsTemplate;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @PostMapping(value = "/reg")
    public String publish(@RequestBody String payload) {

        ObjectMapper ob = new ObjectMapper();
        RequestFormular requestFormular = null;

        try {
            requestFormular = ob.readValue(payload, RequestFormular.class);

        } catch (JsonParseException e) {
            // TODO Auto-generated catch block

        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block

        } catch (IOException e) {
            // TODO Auto-generated catch block

        }

        jmsTemplate.convertAndSend(queue, requestFormular);

        return "Published Successfully";
    }
}
