package org.example.SiralamaAlgoritmalari;


    public class ShellSort implements ISirala {
        public int[] sirala(int[] girdi) {
            int n = girdi.length;
            for (int gap = n / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < n; i++) {
                    int key = girdi[i];
                    int j;
                    for (j = i; j >= gap && girdi[j - gap] > key; j -= gap) {
                        girdi[j] = girdi[j - gap];
                    }
                    girdi[j] = key;
                }
            }
            return girdi;
        }
    }