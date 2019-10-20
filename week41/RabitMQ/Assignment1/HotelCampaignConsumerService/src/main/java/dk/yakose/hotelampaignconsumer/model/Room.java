/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.hotelampaignconsumer.model;

import java.io.Serializable;

/**
 *
 * @author yakos
 */
public class Room implements Serializable {
    private int roomId;
    private String roomDesciprion;
    private double price;   

    public Room() {
    }

    public Room(int roomId, String roomDesciprion, double price) {
        this.roomId = roomId;
        this.roomDesciprion = roomDesciprion;
        this.price = price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomDesciprion() {
        return roomDesciprion;
    }

    public void setRoomDesciprion(String roomDesciprion) {
        this.roomDesciprion = roomDesciprion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomDesciprion=" + roomDesciprion + ", price=" + price + '}';
    }
   
}
