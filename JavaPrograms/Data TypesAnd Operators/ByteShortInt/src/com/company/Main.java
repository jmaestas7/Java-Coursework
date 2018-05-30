package com.company;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5484300;
	byte myByteValue = 110;
	short myShortValue = 5685;
    long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

    System.out.println(myLongValue);
    }
}
