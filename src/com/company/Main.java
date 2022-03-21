package com.company;

public class Main {

    public static void main(String[] args) {
        // program that performs all arithmetic operations and prints the result to the console
        int val1 = 12, val2 = 5;

        // performing addition, adding val1 to val2
        System.out.println("val1 + val2 = " + (val1 + val2));

        // performing subtraction, subtract val1 from val2
        System.out.println("Val1 - val2 = " + (val1 - val2));

        // performing multiplication, multiply val1 and val2
        System.out.println("val1 * val2 = " + (val1 * val2));

        // performing division, divide val2 from val1
        System.out.println("val1 / val2 = " + (val1 / val2));

        // performing modulo operation, remainder after division
        System.out.println("val1 % val2 = " + (val1 % val2));

        rationalOperators();
        logicalOperators();
}

    static void rationalOperators() {
        int blueTeam = 20;
        int redTeam = 25;

        // == is Equal to
        System.out.println(blueTeam == redTeam); //false

        // != not equal to
        System.out.println(blueTeam != redTeam); //true

        // > greater than
        System.out.println(blueTeam > redTeam); //false

        // < less than
        System.out.println(blueTeam < redTeam); //true

        // >= greater than or equal to
        System.out.println(blueTeam >= 20); //true

        // <= less than or equal to
        System.out.println(redTeam <= blueTeam); //false
    }

    static void logicalOperators() {
        // Logical Operators


        System.out.println("\nLogical Operators:");
        //&& Logical AND: returns true if both sides are true

        // both sides are true
        System.out.println(12 > 6 && 5 <= 10); //true

        // one side false and one side true
        System.out.println(12 > 6 && 5 >=10); //false

        // both sides are false
        System.out.println(12 < 6 && 5 >= 10); //false

        // || Logical OR: returns true if any side is true

        // both sides are true
        System.out.println(12 > 6 || 5 <= 10); //true

        // one side false and one side true
        System.out.println(12 > 6 || 5 >= 10); //true

        // both sides are false
        System.out.println(12 < 6 || 5 >= 10); //false

        // ! Logical NOT: returns the opposite boolean value
        System.out.println(!(12 < 6)); //true

    }
}
