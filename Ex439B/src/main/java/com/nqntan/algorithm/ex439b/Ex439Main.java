package com.nqntan.algorithm.ex439b;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex439Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int tmpCount = 0;
        List<Integer> chaptersPerSubjects = new ArrayList<Integer>();
        while (tmpCount < n && scanner.hasNext()) {
            chaptersPerSubjects.add(scanner.nextInt());
            tmpCount++;
        }
        Collections.sort(chaptersPerSubjects);
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            int numberOfChapter = chaptersPerSubjects.get(i);
            result = result.add(BigInteger.valueOf(numberOfChapter * x));
            if (x > 1) {
                 x--;
             }
        }
        System.out.println(result);
    }
}
