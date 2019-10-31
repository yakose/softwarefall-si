/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose;

import java.util.concurrent.ExecutorService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author yakos
 */
@Path("/transferBuro")
@Produces(MediaType.APPLICATION_XML)
public class TransferBuro {

    private final TransForex forex;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TransferBuro
     */
    public TransferBuro() {
        forex = new TransForex();
    }
    private final ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool();

    /**
     * Retrieves representation of an instance of dk.yakose.TransferBuro
     *
     * @param asyncResponse
     * @param krone
     */
    @GET
    @Path("/{krone}/")
    public void getExchangeFromKroneToDollarXml(@Suspended
            final AsyncResponse asyncResponse, @PathParam(value = "krone")
            final double krone) {
        executorService.submit(() -> {
            asyncResponse.resume(doGetExchangeFromKroneToDollarXml(krone));
        });
    }

    private double doGetExchangeFromKroneToDollarXml(@PathParam("krone") double krone) {
        return forex.exchangeFromKroneToDollar(krone);
    }

    
}
