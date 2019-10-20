/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.newtask;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class NewTask {

  private static final String TASK_QUEUE_NAME = "task_queue";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    try (Connection connection = factory.newConnection();
         Channel channel = connection.createChannel()) {
        channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

        for(int i=1; i <= 10; i++)
        {
            String message = "Hello from #" + i + ".";
            channel.basicPublish("", TASK_QUEUE_NAME,
            MessageProperties.PERSISTENT_TEXT_PLAIN,
            message.getBytes("UTF-8")); 
        
        
            System.out.println(" [x] Sent '" + message + "'");
         }
    }
  }

}