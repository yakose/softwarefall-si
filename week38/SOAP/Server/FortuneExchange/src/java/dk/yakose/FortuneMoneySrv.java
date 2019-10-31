/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose;

import dk.yakose.concretes.ExhageRateImp;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author yakos
 */
@WebService(serviceName = "FortuneMoneySrv")
public class FortuneMoneySrv {
    private final ExhageRateImp exhageRateImp;
    
    public FortuneMoneySrv(){exhageRateImp = new ExhageRateImp();}

    /**
     * This is a sample web service operation
     * @param fromAmount
     * @return 
     */
   @WebMethod(operationName = "exchangeFromKroneToDollar")
     public double exchangeFromKroneToDollar(@WebParam(name = "fromAmount") double fromAmount) {
        
        return exhageRateImp.exchangeFromKroneToDollar(fromAmount);
    }
      @WebMethod(operationName = "exchangeFromDollarToKrone")
      public double exchangeFromDollarToKrone(@WebParam(name = "fromAmount")double fromAmount) {
        return exhageRateImp.exchangeFromDollarToKrone(fromAmount);
    }

    @WebMethod(operationName = "exchangeFromKroneToEuro")
    public double exchangeFromKroneToEuro(@WebParam(name = "fromAmount")double fromAmount) {
        return exhageRateImp.exchangeFromKroneToEuro(fromAmount);
    }

     @WebMethod(operationName = "exchangeFromEuroToKrone")
    public double exchangeFromEuroToKrone(@WebParam(name = "fromAmount")double fromAmount) {
         return exhageRateImp.exchangeFromEuroToKrone(fromAmount);
    }

     @WebMethod(operationName = "exchangeFromKroneToPoud")
    public double exchangeFromKroneToPoud(@WebParam(name = "fromAmount")double fromAmount) {
        return exhageRateImp.exchangeFromKroneToPoud(fromAmount);
    }

    @WebMethod(operationName = "exchangeFromPoundToKrone")
    public double exchangeFromPoundToKrone(@WebParam(name = "fromAmount")double fromAmount) {
       return exhageRateImp.exchangeFromPoundToKrone(fromAmount);
    }
    
    
}
