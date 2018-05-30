package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = '\u007A';
        System.out.println("Unicode output was: " + myChar);

        char copyright = '\u00AE';
        char registered = '\u00A9';

        System.out.println(copyright + " " + registered);

        char numChar = 101;

        System.out.println(numChar);

    }
}
