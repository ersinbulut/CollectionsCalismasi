package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class Odev4 {

    public static void main(String args[]){
        Scanner tarayici=new Scanner(System.in);

        ArrayList<Personel> personeller= new ArrayList<>();

        for(int i = 0;i<5;i++){

            System.out.println((i+1)+". personel isim : ");
            String isim = tarayici.next();

            System.out.println((i+1)+". personel adres il : ");
            String il = tarayici.next();

            System.out.println((i+1)+". personel adres ilce : ");
            String ilce = tarayici.next();

            Adres yeniAdres = new Adres(il,ilce);

            Personel yeniPersonel = new Personel(i+1,isim,yeniAdres);

            personeller.add(yeniPersonel);

        }

        for(Personel p : personeller){

            System.out.println("--------------");
            System.out.println("Personel no : "+p.getPersonelNo());
            System.out.println("Personel isim : "+p.getIsim());
            System.out.println("--- Adress ---");
            System.out.println("Personel il : "+p.getAdres().getIl());
            System.out.println("Personel ilce : "+p.getAdres().getIlce());
            
        }




    }


}
