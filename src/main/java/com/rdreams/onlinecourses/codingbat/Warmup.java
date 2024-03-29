package com.rdreams.onlinecourses.codingbat;


public class Warmup {
    // The parameter weekday is true if it is a weekday, and the parameter vacation
    // is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we
    // sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
    // if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    // Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    public int sumDouble(int a, int b) {
        return (a == b) ? (a + b) * 2 : (a + b);
    }

    // Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        return (n > 21) ? (n - 21) * 2 : (21 - n);
    }

    // Given 2 positive int values, return the larger value that is in the range
    // 10..20
    // inclusive, or return 0 if neither is in that range.
    public int max1020(int a, int b) {
        int result = 0;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >=10 && a <= 20) {
            result = a;
        }
        else if (b >= 10 && b <= 20) {
            result = b;
        }
        return result;
    }
}

