package org.example.SiralamaAlgoritmalari;

import org.example.SiralamaAlgoritmalari.ISirala;

public class BubbleSort implements ISirala {
    public int[] sirala(int[] girdi) {
        int n = girdi.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (girdi[j] > girdi[j+1]) {
                    int temp = girdi[j];
                    girdi[j] = girdi[j+1];
                    girdi[j+1] = temp;
                }
        return girdi;
    }
}