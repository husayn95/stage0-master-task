package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        //using the XOR operator
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After swapping: " +"first = " + first + ". second = " + second);

    }

}
