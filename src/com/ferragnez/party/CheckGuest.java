package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner input = new Scanner(System.in);
        String nameUser = input.nextLine();
        input.close();

        System.out.println(nameUser);

        // for(int i = 0; i < guestList.length; i++){
        // if(guestList[i].equals(nameUser)){
        // System.out.println("Puoi entrare");
        // break;
        // }
        // else {
        // System.out.println("Puoi tornare cortesemente da dove sei venuto");
        // }
        // }

        // boolean counter = false;

        // for(int i = 0; i < guestList.length; i++){
        // if(guestList[i].equals(nameUser)){
        // System.out.println("Puoi entrare");
        // counter = true;
        // }
        // }
        // if(counter == false){
        // System.out.println("Puoi tornare cortesemente da dove sei venuto");
        // }

        // int counter = 0;

        // while (counter < guestList.length) {
        // if (guestList[counter].equals(nameUser)) {
        // System.out.println("Puoi entrare");
        // } else {
        // System.out.println("Puoi tornare cortesemente da dove sei venuto");
        // }
        // counter++;
        // }

        int counter = 0;
        boolean checkedName = false;

        while (counter < guestList.length) {
            if (guestList[counter].equals(nameUser)) {
                System.out.println("Puoi entrare");
                checkedName = true;
            }
            counter++;
        }

        if (checkedName == false) {
            System.out.println("Puoi tornare cortesemente da dove sei venuto");
        }
    }

}
