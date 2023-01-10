package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        int checkResult = result * divider;
        if (dividend <= 0 || divider <= 0){

            System.out.println("division by zero");
        }
        if(dividend == checkResult)
            System.out.println("can be divided completely");
        else System.out.println("cannot be divided completely");
    }

}
