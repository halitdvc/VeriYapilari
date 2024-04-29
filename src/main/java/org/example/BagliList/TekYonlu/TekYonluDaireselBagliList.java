package org.example.BagliList.TekYonlu;

public class TekYonluDaireselBagliList {
    private Eleman bas, son;

    class Eleman {
        int veri;
        Eleman sonraki;

        Eleman(int veri) {
            this.veri = veri;
            this.sonraki = this;
        }
    }

    public void ekleSon(int veri) {
        Eleman yeni = new Eleman(veri);

        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.sonraki = yeni;
            son = yeni;
            son.sonraki = bas;
        }
    }

    public void ekleBas(int veri) {
        Eleman yeni = new Eleman(veri);

        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.sonraki = bas;
            bas = yeni;
            son.sonraki = bas;
        }
    }

    public void yazdir() {
        if (bas != null) {
            Eleman temp = bas;
            do {
                System.out.print(temp.veri + " ");
                temp = temp.sonraki;
            } while (temp != bas);
        }
    }
}