package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMain {

    public static void main(String args[]){
        ArrayList<String> meyveler=new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("portakal");

        System.out.println("boyut: "+meyveler.size());

        System.out.println(meyveler.get(1));
        meyveler.add("erik");
        meyveler.remove("muz");// sil
        meyveler.remove(1);// sil

        meyveler.add(1,"mandalina");//araya yerleştirme
        meyveler.set(3,"avakado");

        Collections.sort(meyveler);/*harfe göre sıralama*/

        for (String i:meyveler){
            System.out.print(i+"-");
        }

    }
}
