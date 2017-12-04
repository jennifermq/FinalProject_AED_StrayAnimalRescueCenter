/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Room;

import Business.Employee.Employee;

/**
 *
 * @author user
 */
public class Room {
    private String roomId;
    private Employee vete;
    private String status;
    public static String AVAIL_STATUS = "AVAIL";
    public static String OCCUPIED_STATUS = "OCCUPIED";
    private static int count;

    public Room() {
        this.status = AVAIL_STATUS;
        this.roomId = "Room" + String.valueOf(count+1);
        count++;
    }


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Employee getVete() {
        return vete;
    }

    public void setVete(Employee vete) {
        this.vete = vete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
