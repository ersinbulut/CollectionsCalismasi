package com.info.collectionscalismasi;

import java.util.Objects;

public class Ogrenci implements Comparable<Ogrenci>{
    private int okulno;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int okulno, String isim) {
        this.okulno = okulno;
        this.isim = isim;
    }
    //kapsulleme dolaylı erişim sağlar
    public int getOkulno() {
        return okulno;
    }

    public void setOkulno(int okulno) {
        this.okulno = okulno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int compareTo(Ogrenci ogrenci) {
        return new Integer(this.okulno).compareTo(ogrenci.getOkulno());/*otomatik olarak okulno ye göre küçükten büyüğe sıralama yapar*/
        /*return  new String(this.isim).compareTo(ogrenci.getIsim())  isme gore sıralama */
    }

    @Override
    public int hashCode() {
        return this.okulno;
    }

    @Override
    public boolean equals(Object o) {
        if (this.okulno== ((Ogrenci)o).getOkulno()){
            return true;
        }else{
            return false;
        }
    }
}
