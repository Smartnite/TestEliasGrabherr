package com.grabheli.ticketatm.TestEliasGrabherr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class automat{
    private List<Ticket> ticks = new ArrayList<>();
    private Ticket ticket;

    public void getTicket(){
        Random random = new Random();
        Ticket ticket = new Ticket(random.nextInt(100));
        ticks.add(ticket);
        System.out.println("Ticket erstellt");
    }
    public void showTicks(){
        for(int i = 0; i < ticks.size(); i++){
            System.out.println(ticks.get(i).getId());
        }
    }
    public void insertTicker(int id){
        for(int i = 0; i < ticks.size(); i++){
            if(ticks.get(i).getId() == id){
                ticket = ticks.get(i);
                System.out.println("Ticket eingelesen");
            }
        }
    }
    public float getPrice(){

    }
    public float pay(float amount) {

    }
}
