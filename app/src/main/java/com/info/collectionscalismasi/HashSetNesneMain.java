package com.info.collectionscalismasi;

import java.util.HashSet;

public class HashSetNesneMain {
    public static void main(String args[]){
        HashSet<Ogrenci> nesneler=new HashSet<>();

        Ogrenci o1=new Ogrenci(155,"ahmet");
        Ogrenci o2=new Ogrenci(112,"mehmet");
        Ogrenci o3=new Ogrenci(265,"sedat");
        Ogrenci o4=new Ogrenci(666,"zeynep");

        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);

        Ogrenci o5=new Ogrenci(666,"merve");
        nesneler.add(o5);

        for (Ogrenci o:nesneler){
            System.out.println("*********");
            System.out.println("ogrenci tcno:"+o.getOkulno());
            System.out.println("ogrenci adı:"+o.getIsim());
            System.out.println("*********");
        }

    }
}
