/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.concretes;
import dk.yakose.abstracts.ExchangeRate;
import dk.yakose.beans.Exchange;

/**
 *
 * @author yakos
 */
public class ExhageRateImp  implements ExchangeRate{
     @Override
    public double exchangeFromKroneToDollar(double fromAmount) {
        if(fromAmount <= 0)
            return 0;
        return fromAmount *Exchange.KRONETODOLLAR;
    }

    @Override
    public double exchangeFromDollarToKrone(double fromAmount) {
        if(fromAmount <= 0)
            return 0;        
        return fromAmount * Exchange.DOLLARTOKRONE;
    }

    @Override
    public double exchangeFromKroneToEuro(double fromAmount) {
        if(fromAmount <= 0)
            return 0;
        return fromAmount * Exchange.KRONETOEURO;
    }

    @Override
    public double exchangeFromEuroToKrone(double fromAmount) {
         if(fromAmount <= 0)
            return 0;
        return fromAmount * Exchange.EUROTOKRONE;
    }

    @Override
    public double exchangeFromKroneToPoud(double fromAmount) {
        if(fromAmount <= 0)
            return 0;
        return fromAmount * Exchange.KRONETOPUND;
    }

    @Override
    public double exchangeFromPoundToKrone(double fromAmount) {
        if(fromAmount <= 0)
            return 0;
        return fromAmount * Exchange.PUNDTOKRONE;
    }
    
    
}
