/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose;

import dk.yakose.concretes.ExhageRateImp;

/**
 *
 * @author yakos
 */
public class TransForex {

    private final ExhageRateImp exhageRateImp;

    public TransForex() {
        exhageRateImp = new ExhageRateImp();
    }

    public double exchangeFromKroneToDollar(double fromAmount) {

        return exhageRateImp.exchangeFromKroneToDollar(fromAmount);
    }

    public double exchangeFromDollarToKrone(double fromAmount) {
        return exhageRateImp.exchangeFromDollarToKrone(fromAmount);
    }

    public double exchangeFromKroneToEuro(double fromAmount) {
        return exhageRateImp.exchangeFromKroneToEuro(fromAmount);
    }

    public double exchangeFromEuroToKrone(double fromAmount) {
        return exhageRateImp.exchangeFromEuroToKrone(fromAmount);
    }

    public double exchangeFromKroneToPoud(double fromAmount) {
        return exhageRateImp.exchangeFromKroneToPoud(fromAmount);
    }

    public double exchangeFromPoundToKrone(double fromAmount) {
        return exhageRateImp.exchangeFromPoundToKrone(fromAmount);
    }

}
