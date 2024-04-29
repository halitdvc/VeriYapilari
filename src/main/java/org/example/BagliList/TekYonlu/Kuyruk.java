package org.example.BagliList.TekYonlu;

import java.util.NoSuchElementException;

public class Kuyruk {
    Eleman ilk, son;

    public boolean bosMu() {
        return ilk == null;
    }

    public void ekle(Eleman yeni) {
        if (son != null) 
            son.sonraki = yeni;
        son = yeni;
        if (ilk == null) 
            ilk = yeni;
    }

    public Eleman cikar() {
        if (bosMu()) 
            throw new NoSuchElementException("Kuyruk boş.");
        Eleman cikan = ilk;
        ilk = ilk.sonraki;
        if (ilk == null) {
            son = null;
        }
        return cikan;
    }
}