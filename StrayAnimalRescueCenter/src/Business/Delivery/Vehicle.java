/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Delivery;

/**
 *
 * @author user
 */
public class Vehicle {
    private int vehicleId;
    private int capacity;
    private static int count = 0;

    public Vehicle() {
        count++;
        vehicleId = count;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Vehicle.count = count;
    }
   
}
