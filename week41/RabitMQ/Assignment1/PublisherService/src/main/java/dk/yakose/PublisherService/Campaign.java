/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.yakose.PublisherService;

/**
 *
 * @author yakos
 */
public class Campaign {

    public Campaign() {
    }

    public Campaign(int campaignId, String descreption, String confirm) {
        this.campaignId = campaignId;
        this.descreption = descreption;
        this.confirm = confirm;
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

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
    private int campaignId;
    private String descreption;
    private String confirm;   
    
}
