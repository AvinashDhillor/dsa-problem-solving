import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    final static int mod = (int) (1e9 + 7.0);

    static void mergeUtil(int[] a, int l, int r, int mid) {

    }

    static void mergeSort(int[] a, int l, int r) {
        int l = 0, r = a.length - 1; 
        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, r, mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int[] a = new int[] { 3, 62, 52,13 ,62,73, 84, 1};

        mergeSort(a);

        for(int i =0; i < a.length; i++) {
            print(a[i] + " ");
        }


        sc.close(); 
    }

    static void print(Object s) {
        System.out.print(s);
    } 
}

