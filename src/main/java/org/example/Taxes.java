package org.example;

public class Taxes {
    public static int[] CheckBracket (int salary){
        int[][] brackets = {{0, 14999, 0}, {15000, 19999, 500}, {20000, 29999, 1500}, {30000, 44999, 3000}};
        int[] diffAndBracket = {0,4,0, salary};

        int taxTotal = 0;
        int difference;

        if (salary >= 45000) {
            diffAndBracket[0] = salary - 45000;
        }

        for (int i = 0; i< brackets.length; i++){
            if (salary>brackets[i][0] && salary<brackets[i][1]) {
                difference = salary-brackets[i][0];
                diffAndBracket[0] = difference;
                diffAndBracket[1] = i;
                break;
            }
            else {
                taxTotal += brackets[i][2];
            }
        }
        diffAndBracket[2] = taxTotal;

        return diffAndBracket;
    }
    public static int CalcTakeHome (int[] diffAndBracket) {
        double[] taxPercentages = {0.0, 0.1, 0.15, 0.2, 0.25};
        int taxTotal = diffAndBracket[2];
        int taxCalc = (int)Math.round((diffAndBracket[0] * taxPercentages[diffAndBracket[1]]));

        taxTotal += taxCalc;
        int takeHome = diffAndBracket[3] - taxTotal;

        return takeHome;
    }
}
