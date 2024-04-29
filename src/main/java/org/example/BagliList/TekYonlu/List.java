package org.example.BagliList.TekYonlu;

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
        yeniEleman.sonraki = gecici.sonraki;
        gecici.sonraki = yeniEleman;
    }

    // Baştan silme metodu
    public void bastanSil() {
        if (!bosMu()) {
            bas = bas.sonraki;
            if (bas == null) {
                son = null;
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
        gecici.sonraki = gecici.sonraki.sonraki;
    }

    // Listeyi yazdırma metodu
    public void yazdir() {
        Eleman gecici = bas;
        while (gecici != null) {
            System.out.print(gecici.veri + " -> ");
            gecici = gecici.sonraki;
        }
        System.out.println("null");  // Listenin sonunu gösterir
    }

    // Liste kontrolü
    private boolean bosMu() {
        return bas == null;
    }
}