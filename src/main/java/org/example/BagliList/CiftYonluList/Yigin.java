package org.example.BagliList.CiftYonluList;

public class Yigin {

        Eleman ust;

        public boolean bosMu() {
            return ust == null;
        }

        public void ekle(Eleman yeni) {
            yeni.sonraki = ust;
            ust = yeni;
        }

        public Eleman cikar() {
            if (bosMu())
                throw new IllegalStateException("Yığın boş.");
            Eleman cikan = ust;
            ust = ust.sonraki;
            return cikan;
        }
    }

