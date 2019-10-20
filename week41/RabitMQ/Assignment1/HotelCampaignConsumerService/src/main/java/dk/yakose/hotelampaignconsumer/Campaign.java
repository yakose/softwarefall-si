/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.HotelCampaignPublisher;

import dk.yakose.HotelCampaignPublisher.model.Hotel;
import dk.yakose.HotelCampaignPublisher.model.Room;
import java.util.List;

/**
 *
 * @author yakos
 */
public class Campaign {

    private int campaignId;
    private String descreption;
    private List<Hotel>hotels;
    
    public Campaign() {
    }

    public Campaign(int campaignId, String descreption, List<Hotel> hotels) {
        this.campaignId = campaignId;
        this.descreption = descreption;
        this.hotels = hotels;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public String toString() {
        return "Campaign{" + "campaignId=" + campaignId + ", descreption=" + descreption + ", hotels=" + hotels + '}';
    }
 
    
}
