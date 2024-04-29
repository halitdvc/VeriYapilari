package org.example.SiralamaAlgoritmalari;



    public class BinaryInsertionSort implements ISirala {
        public int[] sirala(int[] girdi) {
            int n = girdi.length;
            for (int i = 1; i < n; i++) {
                int key = girdi[i];
                int j = i - 1;
                int location = Math.abs(binarySearch(girdi, key, 0, j) + 1);
                System.arraycopy(girdi, location, girdi, location+1, i-location);
                girdi[location] = key;
            }
            return girdi;
        }
    
        private int binarySearch(int[] a, int item, int low, int high) {
            if (high <= low)
                return (item > a[low])?  (low + 1): low;
            int mid = (low + high) / 2;
            if(item == a[mid])
                return mid + 1;
            if(item > a[mid])
                return binarySearch(a, item, mid + 1, high);
            return binarySearch(a, item, low, mid - 1);
        }
    }