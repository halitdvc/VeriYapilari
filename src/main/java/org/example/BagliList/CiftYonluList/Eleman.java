package org.example.BagliList.CiftYonluList;

public class Eleman {
    int veri;
    Eleman onceki, sonraki;

    public Eleman(int veri) {
        this.veri = veri;
        this.onceki = this.sonraki = null;
    }
}