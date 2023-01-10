package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if(month <= 0 || month > 12){
            System.out.println("invalid date");}
        if(year <=0 || year >= 3000){
            System.out.println("Invalid date!");
        }

        boolean leap = false;
        // if the year is divided by 4 and there is no remainder i,e if it is perfectly divisible.
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is a a century, then it has to be perfectly divisible by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
            if(leap == true && month == 2)
                System.out.println("29");
        }


        if(month == 1)
            System.out.println("31 days");
        if(month == 2)
        System.out.println("28");
        if(month == 3)
            System.out.println("31 days");
        if(month == 4)
            System.out.println("30 days");
        if(month == 5)
            System.out.println("31 days");
        if(month == 6)
            System.out.println("30");
        if(month == 7)
            System.out.println("31 days");
        if(month == 8)
            System.out.println("31 days");
        if(month == 9)
            System.out.println("30 days");
        if(month == 10)
            System.out.println("31 days");
        if(month == 11)
            System.out.println("30 days");
        if(month == 12)
            System.out.println("31 days");

    }

}
