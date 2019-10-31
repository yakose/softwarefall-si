/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.camunda.bpm.client.ExternalTaskClient;

/**
 *
 * @author yakos
 */
public class ChargeCardWorker {private final static Logger LOGGER = Logger.getLogger(ChargeCardWorker.class.getName());

  public static void main(String[] args) {
    ExternalTaskClient client = ExternalTaskClient.create()
        .baseUrl("http://localhost:8080/engine-rest")
        .asyncResponseTimeout(10000) // long polling timeout
        .build();

    // subscribe to an external task topic as specified in the process
    client.subscribe("charge-card")
        .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
        .handler((externalTask, externalTaskService) -> {
          // Put your business logic here

          // Get a process variable
          String item = (String) externalTask.getVariable("item");
          Long amount = (Long) externalTask.getVariable("amount");
          LOGGER.log(Level.INFO, "Charging credit card with an amount of ''{0}''\u20ac for the item ''{1}''...", new Object[]{amount, item});

          // Complete the task
          externalTaskService.complete(externalTask);
        })
        .open();
  }
}
