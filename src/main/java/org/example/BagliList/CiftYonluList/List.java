package org.example.BagliList.CiftYonluList;

public class List {

    private Eleman bas;
    private Eleman son;

    public List() {
        bas = son = null;
    }

    // Başa ekleme metodu
    public void basaEkle(int veri) {
        Eleman yeniEleman = new Eleman(veri);
        if (bosMu()) {
            bas = son = yeniEleman;
        } else {
            yeniEleman.sonraki = bas;
            bas.onceki = yeniEleman;
            bas = yeniEleman;
        }
    }

    // Sona ekleme metodu
    public void sonaEkle(int veri) {
        Eleman yeniEleman = new Eleman(veri);
        if (bosMu()) {
            bas = son = yeniEleman;
        } else {
            son.sonraki = yeniEleman;
            yeniEleman.onceki = son;
            son = yeniEleman;
        }
    }

    // İndekse ekleme metodu
    public void indekseEkle(int veri, int indeks) {
        Eleman yeniEleman = new Eleman(veri);
        Eleman gecici = bas;
        int i = 1;
        while (i < indeks) {
            gecici = gecici.sonraki;
            i++;
        }
        yeniEleman.onceki = gecici;
        yeniEleman.sonraki = gecici.sonraki;
        gecici.sonraki.onceki = yeniEleman;
        gecici.sonraki = yeniEleman;
    }

    // Baştan silme metodu
    public void bastanSil() {
        if (!bosMu()) {
            bas = bas.sonraki;
            if (bas != null) {
                bas.onceki = null;
            } else {
                son = null;
            }
        }
    }

    // Sondan silme metodu
    public void sondanSil() {
        if (!bosMu()) {
            son = son.onceki;
            if (son != null) {
                son.sonraki = null;
            } else {
                bas = null;
            }
        }
    }

    // İndeksten silme metodu
    public void indekstenSil(int indeks) {
        Eleman gecici = bas;
        int i = 1;
        while (i < indeks) {
            gecici = gecici.sonraki;
            i++;
        }
        gecici.onceki.sonraki = gecici.sonraki;
        gecici.sonraki.onceki = gecici.onceki;
    }

    // Listeyi yazdırma metodu
    public void yazdir() {
        Eleman gecici = bas;
        while (gecici != null) {
            System.out.println(gecici.veri);
            gecici = gecici.sonraki;
        }
    }

    // Liste kontrolü
    private boolean bosMu() {
        return bas == null;
    }
}
