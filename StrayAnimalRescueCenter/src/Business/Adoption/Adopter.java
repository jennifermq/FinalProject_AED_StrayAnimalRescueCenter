/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adoption;

/**
 *
 * @author user
 */
public class Adopter {
    private String ssn;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private Address address;
    private String email;
    private AdoptionHistoryDir historyDir;

    public Adopter() {
        historyDir = new AdoptionHistoryDir();
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AdoptionHistoryDir getHistoryDir() {
        return historyDir;
    }

    public void setHistoryDir(AdoptionHistoryDir historyDir) {
        this.historyDir = historyDir;
    }
    
}
