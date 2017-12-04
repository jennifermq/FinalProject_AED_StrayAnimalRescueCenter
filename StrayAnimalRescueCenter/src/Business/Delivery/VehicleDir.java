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
public class VehicleDir {
    private ArrayList<Vehicle> vehicleList;

    public VehicleDir() {
        vehicleList = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    
    public void addVehicle(Vehicle v) {
        vehicleList.add(v);
    }
    
    public void removeVehicle(Vehicle v) {
        vehicleList.remove(v);
    }
}
