/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Adoption.Adopter;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class VisitorAccountDir{
    private ArrayList<VisitorAccount> visitorAccountList;

    public VisitorAccountDir() {
        visitorAccountList = new ArrayList();
    }

    public ArrayList<VisitorAccount> getVisitorAccountList() {
        return visitorAccountList;
    }
    
    public VisitorAccount authenticateUser(String username, String password){
        for (VisitorAccount va : visitorAccountList)
            if (va.getUsername().equals(username) && va.getPassword().equals(password)){
                return va;
            }
        return null;
    }
    
    public VisitorAccount createUserAccount(String username, String password, Adopter adoptor){
        VisitorAccount visitorAccount = new VisitorAccount();
        visitorAccount.setUsername(username);
        visitorAccount.setPassword(password);
        visitorAccount.setAdoptor(adoptor);
        visitorAccountList.add(visitorAccount);
        return visitorAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (VisitorAccount va : visitorAccountList){
            if (va.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
