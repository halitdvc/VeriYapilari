package org.example.SiralamaAlgoritmalari;


    public class SelectionSort implements ISirala {
        public int[] sirala(int[] girdi) {
            int n = girdi.length;
            for (int i = 0; i < n - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (girdi[j] < girdi[min_idx])
                        min_idx = j;
                int temp = girdi[min_idx];
                girdi[min_idx] = girdi[i];
                girdi[i] = temp;
            }
            return girdi;
        }
    }