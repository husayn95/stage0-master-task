package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if( firstSide  <= 0 || secondSide  <= 0 || thirdSide <= 0)
            System.out.println("it's not a triangle");
        //In theory a triangle can be however large or small as possible. That's why we are using Doubles Max value.
        if( firstSide  > Double.MAX_VALUE || secondSide  > Double.MAX_VALUE || thirdSide > Double.MAX_VALUE)
            System.out.println("it's not a triangle");
        else System.out.println("this is a valid triangle");

    }

}
