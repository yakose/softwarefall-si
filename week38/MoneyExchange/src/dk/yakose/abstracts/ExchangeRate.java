/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.abstracts;

/**
 *
 * @author yakos
 */
public interface ExchangeRate {
    double exchangeFromKroneToDollar(double fromKrone);

    double exchangeFromDollarToKrone(double fromDollar);

    double exchangeFromKroneToEuro(double fromDollar);

    double exchangeFromEuroToKrone(double fromEuro);

    double exchangeFromKroneToPoud(double fromKrone);

    double exchangeFromPoundToKrone(double fromPound);
    
}
