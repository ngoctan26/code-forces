package com.nqntan.algorithm.ex551a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex551A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmpCount = 0;
        List<Integer> studentRatings = new ArrayList<Integer>();
        while (tmpCount < n && scanner.hasNext()) {
            studentRatings.add(scanner.nextInt());
            tmpCount++;
        }
        List<Integer> sortedList = new ArrayList<Integer>(studentRatings);
        Collections.sort(sortedList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        Map<Integer, Integer> positionToRating = new HashMap<Integer, Integer>();
        positionToRating.put(sortedList.get(0), 1);
        for (int i = 1; i < n; i++) {
            int checkedValue = sortedList.get(i);
            int prevValue = sortedList.get(i - 1);
            if (checkedValue != prevValue) {
                positionToRating.put(checkedValue, i + 1);
            }
        }
        for (int j = 0; j < n; j++) {
            int checkedRate = studentRatings.get(j);
            System.out.print(positionToRating.get(checkedRate) + " ");
        }
    }
}
