/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Room;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RoomDir {
    private ArrayList<Room> roomList;

    public RoomDir() {
        roomList = new ArrayList<Room>(); 
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
    
    public void addRoom(Room r) {
        roomList.add(r);
    }
    
    public void removeRoom(Room r) {
        roomList.remove(r);
    }
    
}
