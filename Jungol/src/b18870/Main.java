package b18870;

import java.io.*;
import java.util.*;

public class Main {
    static int[] xArrTmp;
    static int[] idxArrTmp;
    
    static int readPosInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32)
            n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }

    static int readInt() throws IOException {
        int c, n = System.in.read() & 15;
        boolean neg = n == 13;
        if (neg) n = System.in.read() & 15;
        while ((c = System.in.read()) > 32)
            n = (n << 3) + (n << 1) + (c & 15);
        return neg ? ~n + 1 : n;
    }

    static void mergeSort(int[] x, int[] idx, int s, int e) {
        if (s < e) {
            int m = (s + e) >>> 1;
            mergeSort(x, idx, s, m);
            mergeSort(x, idx, m + 1, e);
            merge(x, idx, s, m, e);
        }
    }

    static void merge(int[] x, int[] idx, int s, int m, int e) {
        int l = s, r = m + 1, t = s;
        while (l <= m && r <= e) {
            if (x[l] <= x[r]) {
                xArrTmp[t] = x[l];
                idxArrTmp[t] = idx[l];
                l++;
            } else {
                xArrTmp[t] = x[r];
                idxArrTmp[t] = idx[r];
                r++;
            }
            t++;
        }
        while (l <= m) {
            xArrTmp[t] = x[l];
            idxArrTmp[t] = idx[l];
            l++;
            t++;
        }
        while (r <= e) {
            xArrTmp[t] = x[r];
            idxArrTmp[t] = idx[r];
            r++;
            t++;
        }
        System.arraycopy(xArrTmp, s, x, s, e - s + 1);
        System.arraycopy(idxArrTmp, s, idx, s, e - s + 1);
    }

    public static void main(String[] args) throws IOException {
        int n = readPosInt();
        int[] x = new int[n], idx = new int[n], res = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = readInt();
            idx[i] = i;
        }
        xArrTmp = new int[n];
        idxArrTmp = new int[n];
        mergeSort(x, idx, 0, n - 1);
        int cnt = 0, dup = x[0];
        for (int i = 0; i < n; i++) {
            if (x[i] == dup)
                res[idx[i]] = cnt;
            else {
                dup = x[i];
                res[idx[i]] = ++cnt;
            }
        }
        StringBuilder sb = new StringBuilder(n * 2);
        for (int i = 0; i < n; i++)
            sb.append(res[i]).append(' ');
        System.out.print(sb);
    }
}
