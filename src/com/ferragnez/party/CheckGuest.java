package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestlist = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner input = new Scanner(System.in);
        String nameUser = input.nextLine();
        input.close();

        System.out.println(nameUser);

        // for(int i = 0; i < guestlist.length; i++){
        //     if(guestlist[i].equals(nameUser)){
        //         System.out.println("Puoi entrare");
        //         break;
        //     }
        //     else {
        //         System.out.println(":occhiali_da_sole:");
        //     }
        // }
        
        boolean counter = false;

        for(int i = 0; i < guestlist.length; i++){
            if(guestlist[i].equals(nameUser)){
                System.out.println("Puoi entrare");
                counter = true;
            }
        } 
        if(counter == false){
            System.out.println(":occhiali_da_sole:");
        }
    }

}
