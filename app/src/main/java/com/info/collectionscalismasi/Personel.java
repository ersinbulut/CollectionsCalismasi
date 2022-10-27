package com.info.collectionscalismasi;

/**
 * Created by kasimadalan on 14.02.2018.
 */

public class Personel {
    private int personelNo;
    private String isim;
    private Adres adres;

    public Personel() {
    }

    public Personel(int personelNo, String isim, Adres adres) {
        this.personelNo = personelNo;
        this.isim = isim;
        this.adres = adres;
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
