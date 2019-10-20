/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.HotelCampaignPublisher.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author yakos
 */
public class Hotel implements Serializable{
    private int hotelId;
    private String hotelName;
    private String address;
    private String zipCode;
    private String city;
    private String phoneNumber;
    private String country;
    private double rating;
    
    private List<Room> rooms;

    public Hotel() {
    }

    public Hotel(int hotelId, String hotelName, String address, String zipCode, String city, String phoneNumber, String country, double rating, List<Room> rooms) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.rating = rating;
        this.rooms = rooms;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", zipCode=" + zipCode + ", city=" + city + ", phoneNumber=" + phoneNumber + ", country=" + country + ", rating=" + rating + ", rooms=" + rooms + '}';
    }
    
    

       
}
