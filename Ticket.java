package com.grabheli.ticketatm.TestEliasGrabherr;

import java.util.Date;
import java.util.Random;

public class Ticket {
    private int id;
    private Date eingeloest;
    private Date bezahlt;
    public Ticket(int newId){
        id = newId;
        eingeloest = new Date();
    }
    public Date getEingeloest() {
        return eingeloest;
    }
    public Date getbezahlt() {
        return bezahlt;
    }
    public int getId() {
        return id;
    }
    public void bezahlen() {
        this.bezahlt = new Date();
    }
}
