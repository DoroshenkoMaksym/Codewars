package com.doroshenko.sum;

/**
 * Created by maksym on 1/23/16.
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        System.out.println(sumOfNumbers.getSum(1, 0));
        System.out.println(sumOfNumbers.getSum(1, 2));
        System.out.println(sumOfNumbers.getSum(0, 1));
        System.out.println(sumOfNumbers.getSum(1, 1));
        System.out.println(sumOfNumbers.getSum(-1, 0));
        System.out.println(sumOfNumbers.getSum(-1, 2));
    }

    public int getSum(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a < b) {
            return recursionSum(a, b, 0);
        } else {
            return recursionSum(b, a, 0);
        }
    }

    private int recursionSum(int min, int max, int acc) {
        if (min == max) {
            return acc + max;
        } else {
                acc += min;
            return recursionSum(min + 1, max, acc);
        }

    }
}
