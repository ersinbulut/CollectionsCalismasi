package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Odev1 {
    public static void main(String args[]){

        ArrayList<Integer> sayilar=new ArrayList<>();
        Random uret=new Random();

        for (int i=0;i<100;i++){
            int rastgeleSayi= uret.nextInt(100);//0 ile 100
            sayilar.add(rastgeleSayi);
        }
        Collections.sort(sayilar);
        for (Integer i:sayilar){
            System.out.println(i);
        }

    }
}
