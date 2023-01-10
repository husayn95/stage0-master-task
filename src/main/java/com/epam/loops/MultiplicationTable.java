package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int counter = 1;
        int tableRow = 10;
        while (counter <= tableRow){
            int result = numberTableToPrint * counter;
            System.out.println(counter + " x " + numberTableToPrint + " = " + result);
            counter++;
        }
    }

}
