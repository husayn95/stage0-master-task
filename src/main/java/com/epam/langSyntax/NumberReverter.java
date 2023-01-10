package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed = 0;

       // System.out.println("Original Number: " + number);

        // run loop until number becomes 0
        while(number != 0) {

            // get last digit from number
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from number
            number /= 10;
        }

        System.out.println(reversed);
    }

}
