package com.grabheli.ticketatm.TestEliasGrabherr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        automat automat = new automat();
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1. Neues Ticket\n2. Ticket scannen\n3. Bezahlen\n");
            int auswahl = scan.nextInt();

            if(auswahl == 1) {
                automat.getTicket();
            }
            else if(auswahl == 2) {

            }
            else if(auswahl == 3) {

            }
            else if(auswahl == 4) {

            }
            else {
            }
        }while(true);
    }
}