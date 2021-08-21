package com.learningjava;

public class Main {

    public static void main(String[] args) {
        int value = 1000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + minIntValue);
        System.out.println("Integer Maximum Value = " + maxIntValue);
        System.out.println("Busted Max value = " + (maxIntValue + 1));
        System.out.println("Bused MIN value = " + (minIntValue - 1));
    }
}
