/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Delivery;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DeliveryHistoryDir {
    private ArrayList<DeliveryHistory> deliveryHistoryList;

    public DeliveryHistoryDir() {
        deliveryHistoryList = new ArrayList<DeliveryHistory>();
    }

    public ArrayList<DeliveryHistory> getDeliveryHistoryList() {
        return deliveryHistoryList;
    }

    public void setDeliveryHistoryList(ArrayList<DeliveryHistory> deliveryHistoryList) {
        this.deliveryHistoryList = deliveryHistoryList;
    }
    
    public void addDeliveryHistory(DeliveryHistory dh) {
        deliveryHistoryList.add(dh);
    }
    
    public void removeDeliveryHistory(DeliveryHistory dh) {
        deliveryHistoryList.remove(dh);
    }
    
}
