package com.nqntan.fullproject.ex387b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EX387BMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int tmpCount = 0;
        List<Integer> goodRoundPrbComplexities = new ArrayList<Integer>();
        List<Integer> preparedPrbComplexities = new ArrayList<Integer>();
        while (tmpCount < n && scanner.hasNext()) {
            goodRoundPrbComplexities.add(scanner.nextInt());
            tmpCount++;
        }
        tmpCount = 0;
        while (tmpCount < m && scanner.hasNext()) {
            preparedPrbComplexities.add(scanner.nextInt());
            tmpCount++;
        }
        List<Integer> extraProbs = new ArrayList<Integer>();
        int currentGoodPrepareCount = 0;
        for (Integer preparedPrbComplexity : preparedPrbComplexities) {
            if (currentGoodPrepareCount == n) {
                break;
            }
            if (goodRoundPrbComplexities.contains(preparedPrbComplexity)) {
                currentGoodPrepareCount++;
            } else {
                extraProbs.add(preparedPrbComplexity);
            }
        }
        int extraProbsCount = 0;
        for (Integer goodComplexity : goodRoundPrbComplexities) {
            if (currentGoodPrepareCount + extraProbsCount == n) {
                break;
            }
            for (Integer extraProbsComplexity : extraProbs) {
                if (currentGoodPrepareCount + extraProbsCount == n) {
                    break;
                }
                if (goodComplexity < extraProbsComplexity) {
                    extraProbsCount++;
                }
            }
        }
        System.out.println(extraProbsCount);
    }
}
