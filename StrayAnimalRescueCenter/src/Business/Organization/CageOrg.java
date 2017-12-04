/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Cage.CageCellDir;
import Business.Role.Role;
import Business.Role.VeteAssistantRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CageOrg extends Organization{
    private CageCellDir cageCellDir;
    
    public CageOrg() {
        super(Organization.Type.Cage.getValue());
    }

    public CageCellDir getCageCellDir() {
        return cageCellDir;
    }

    public void setCageCellDir(CageCellDir cageCellDir) {
        this.cageCellDir = cageCellDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new VeteAssistantRole());
        return roles;
    }

}
