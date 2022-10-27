package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class Odev3 {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        Random uret = new Random();

        int sayi = uret.nextInt(101);

        System.out.println("Üretilen sayı : "+sayi);

        ArrayList<Integer> tahminler = new ArrayList<>();

        for(int i = 0;i<5;i++){

            System.out.println((i+1)+". tahminizi giriniz");
            int tahmin = tarayici.nextInt();

            tahminler.add(tahmin);

            if(tahmin == sayi){
                System.out.println("Tebrikler kazandınız");
                break;
            }

            if(tahmin > sayi){
                System.out.println("Tahminini azalt");
            }

            if(tahmin < sayi){
                System.out.println("Tahmin yükselt");
            }

        }
        System.out.println("----------------------");
        System.out.println("Üretilen sayı : "+sayi);
        System.out.println("Tahminler : ");

        for(Integer i:tahminler){
            System.out.print(i+" - ");
        }




    }
}
