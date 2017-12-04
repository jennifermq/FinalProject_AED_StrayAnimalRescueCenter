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

/**
 *
 * @author user
 */
public class VisitorAccount{
    private String username;
    private String password;
    private Adopter adoptor;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Adopter getAdoptor() {
        return adoptor;
    }

    public void setAdoptor(Adopter adoptor) {
        this.adoptor = adoptor;
    }
    
}
