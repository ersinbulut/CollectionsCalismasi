package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev2 {
    public static void main(String args[]){
        ArrayList<String> isimler=new ArrayList<>();

        isimler.add("ahmet");
        isimler.add("zeynep");
        isimler.add("ece");
        isimler.add("serdar");
        isimler.add("melis");

        Scanner tarayici=new Scanner(System.in);

        System.out.println("Arama ismini gir:");
        String isim=tarayici.next();

        for (String s:isimler){
            if (s.equalsIgnoreCase(isim)) {
                System.out.println("isim mevcut");
                break;
            }
        }
    }
}
