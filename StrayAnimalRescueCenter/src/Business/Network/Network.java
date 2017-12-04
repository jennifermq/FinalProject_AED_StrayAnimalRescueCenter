/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDir;

/**
 *
 * @author user
 */
public class Network {
    private String name;
    private EnterpriseDir enterpriseDir;

    public Network() {
        enterpriseDir = new EnterpriseDir();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDir getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(EnterpriseDir enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
