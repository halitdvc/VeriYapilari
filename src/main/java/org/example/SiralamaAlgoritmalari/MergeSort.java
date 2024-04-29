package org.example.SiralamaAlgoritmalari;

public class MergeSort implements ISirala {
    public int[] sirala(int[] girdi) {
        mergeSort(girdi, 0, girdi.length - 1);
        return girdi;
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] Left = new int[n1];
        int[] Right = new int[n2];

        for (int i = 0; i < n1; i++)
            Left[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            Right[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            } else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = Right[j];
            j++;
            k++;
        }
    }
}