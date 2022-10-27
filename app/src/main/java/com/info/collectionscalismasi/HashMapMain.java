package com.info.collectionscalismasi;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {
    public static void main(String args[]){

        HashMap<Integer,String> plakalar=new HashMap<>();

        plakalar.put(16,"Bursa");
        plakalar.put(34,"İstanbul");
        plakalar.put(06,"Ankara");

        System.out.println(plakalar.get(16));

        Set<Integer> anahtarlar=plakalar.keySet();

        for (Integer i:anahtarlar){
            System.out.print(plakalar.get(i)+"-");
        }

        HashMap<Integer,Ogrenci> nesneler=new HashMap<>();

        Ogrenci o1=new Ogrenci(155,"ahmet");
        Ogrenci o2=new Ogrenci(112,"mehmet");
        Ogrenci o3=new Ogrenci(265,"sedat");
        Ogrenci o4=new Ogrenci(666,"zeynep");

        nesneler.put(o1.getOkulno(),o1);
        nesneler.put(o2.getOkulno(),o2);
        nesneler.put(o3.getOkulno(),o3);
        nesneler.put(o4.getOkulno(),o4);

        Set<Integer> okulNolari=nesneler.keySet();

        for (Integer no:okulNolari){
            System.out.println("*********");
            System.out.println("ogrenci okulno:"+nesneler.get(no).getOkulno());
            System.out.println("ogrenci adı:"+nesneler.get(no).getIsim());
            System.out.println("*********");
        }


    }
}
