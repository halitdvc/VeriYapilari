package org.example.SiralamaAlgoritmalari;



    public class InsertionSort implements ISirala {
        public int[] sirala(int[] girdi) {
            int n = girdi.length;
            for (int i = 1; i < n; ++i) {
                int key = girdi[i];
                int j = i - 1;
                while (j >= 0 && girdi[j] > key) {
                    girdi[j + 1] = girdi[j];
                    j = j - 1;
                }
                girdi[j + 1] = key;
            }
            return girdi;
        }
    }