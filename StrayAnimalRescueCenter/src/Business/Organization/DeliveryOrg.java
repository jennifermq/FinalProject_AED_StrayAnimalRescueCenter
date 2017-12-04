/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryRole;
import Business.Role.Role;
import Business.Delivery.VehicleDir;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DeliveryOrg extends Organization{
    private VehicleDir vehicleDir;
    
    public DeliveryOrg() {
        super(Organization.Type.Delivery.getValue());
    }

    public VehicleDir getVehicleDir() {
        return vehicleDir;
    }

    public void setVehicleDir(VehicleDir vehicleDir) {
        this.vehicleDir = vehicleDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new DeliveryRole());
        return roles;
    }

}
