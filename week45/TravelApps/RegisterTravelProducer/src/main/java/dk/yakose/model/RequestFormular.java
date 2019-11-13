/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class RequestFormular implements Serializable{
    
    private Employee employee;
    private String travelPurpose;
    private List<String> neededArangement;
    private String departureCity;
    private String arrivalCity;
    private Date departureDate;
    private Date returnDate;

    public RequestFormular() {
    }

    public RequestFormular(Employee employee, String travelPurpose, List<String> neededArangement, String departureCity, String arrivalCity, Date departureDate, Date returnDate) {
        this.employee = employee;
        this.travelPurpose = travelPurpose;
        this.neededArangement = neededArangement;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTravelPurpose() {
        return travelPurpose;
    }

    public void setTravelPurpose(String travelPurpose) {
        this.travelPurpose = travelPurpose;
    }

    public List<String> getNeededArangement() {
        return neededArangement;
    }

    public void setNeededArangement(List<String> neededArangement) {
        this.neededArangement = neededArangement;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "RequestFormular{" + "employee=" + employee + ", travelPurpose=" + travelPurpose + ", neededArangement=" + neededArangement + ", departureCity=" + departureCity + ", arrivalCity=" + arrivalCity + ", departureDate=" + departureDate + ", returnDate=" + returnDate + '}';
    }
    
    
    
}
