/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;


import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.VisitorAccount;
import Business.UserAccount.VisitorAccountDir;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization{

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private VisitorAccountDir visitorAccountDir;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        visitorAccountDir = new VisitorAccountDir();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();           
        }
        return business;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public VisitorAccountDir getVisitorAccountDir() {
        return visitorAccountDir;
    }

    public void setVisitorAccountDir(VisitorAccountDir visitorAccountDir) {
        this.visitorAccountDir = visitorAccountDir;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public boolean checkIfUserNameIsUnique(String username){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
}

