package org.example.BagliList.CiftYonluList;

public class CiftYonluDaireselBagliList {
    private Eleman bas, son;

    class Eleman {
        int veri;
        Eleman sonraki, onceki;

        Eleman(int veri) {
            this.veri = veri;
            sonraki = this;
            onceki = this;
        }
    }

    public void ekleSon(int veri) {
        Eleman yeni = new Eleman(veri);

        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.sonraki = yeni;
            yeni.onceki = son;
            son = yeni;
            son.sonraki = bas;
            bas.onceki = son;
        }
    }

    public void ekleBas(int veri) {
        Eleman yeni = new Eleman(veri);

        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.sonraki = bas;
            bas.onceki = yeni;
            bas = yeni;
            bas.onceki = son;
            son.sonraki = bas;
        }
    }

    public void yazdir() {
        if (bas != null) {
            Eleman temp = bas;

            do {
                System.out.print(temp.veri + " ");
                temp = temp.sonraki;
            }
            while (temp != bas);
        }
    }
}