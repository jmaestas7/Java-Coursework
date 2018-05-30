package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    System.out.println("1 + 2 = " + result);

	    int previousResult = result;

	    result = result - 1;
	    System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 10;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAliean = true;
        if (!isAliean)
            System.out.println("Is not an Alien");
        else
            System.out.println("Is an Alien");

        int topScore = 90;
        if (topScore >= 100)
            System.out.println("You got the high score");
        else
            System.out.println("Try Again");

        int secondScore = 60;

        if ((topScore > secondScore) && (topScore <100))
            System.out.println("Top Score is higher than " + secondScore + " and less than 100");

        if ((topScore > secondScore) || (topScore <50))
            System.out.println("Top Score is higher than " + secondScore + " or less than 50");

        int newValue = 50;
        if (newValue == 50)
            System.out.println(newValue + " is equal to 50");

        boolean isCar = true;
        if (isCar == true)
            System.out.println("This is happening");

        boolean wasCar  = isCar ? false:true;
        if (!wasCar)
           System.out.println("wasCar was false");

        double newestValue = 20d;
        double secondNewValue = 80d;
        double total = ((newestValue + secondNewValue) * 25d) %  40;
        if (total <= 20)
            System.out.println("Total was over the limit. " + "Total was: " + (int)total);


    }
}
