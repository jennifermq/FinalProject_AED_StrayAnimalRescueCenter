/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EnterpriseDir {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDir() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise e = null;
        if(type == Enterprise.EnterpriseType.RescueCenter) {
            e = new RescueCenterEnterprise(name);
            enterpriseList.add(e);
        }
        return e;
    }
}
