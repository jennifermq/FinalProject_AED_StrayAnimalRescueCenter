/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PharmacyWorkQueue {
    private ArrayList<PharmacyWorkRequest> workRequestList;

    public PharmacyWorkQueue() {
        workRequestList = new ArrayList<PharmacyWorkRequest>();
    }

    public ArrayList<PharmacyWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
