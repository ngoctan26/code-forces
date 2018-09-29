package com.nqntan.algorithm.ex557b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex557BMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of girls or boys
        int w = scanner.nextInt(); // Max water input
        int tmpCount = 0;
        List<Integer> teaCapacities = new ArrayList<Integer>();
        while (tmpCount < n && scanner.hasNext()) {
            teaCapacities.add(scanner.nextInt());
            tmpCount++;
        }

        /**
         * w
         * 2n tach tra
         * n (nam) = n (nu)
         *
         * VD:
         * 2 4
         * 1   1  |  1  1  (so tach tra)
         * 0.5 0.5   1  1  (luong nuoc)
         *
         * Solution:
         *
         * Sap xep a
         *
         * nu: a[0]
         * nam: a[n]
         *
         * neu nu la a[0] -> nam phai uong 2*a[0]
         *
         * => tranh 2*a[0] > a[n]
         * => a[0] = a[n]/2
         * goi a[n]/2 = x
         *
         * tong so luong nuoc: 3*x*n (ca nam va nu)
         * dk: w (tong so luong nuoc input) > 3*x*n
         *
         */
    }
}
