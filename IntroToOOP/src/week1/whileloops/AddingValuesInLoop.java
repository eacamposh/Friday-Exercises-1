package week1.whileloops;

/*
 * Write a program that gets several integers from the user.
 * Sum up all the integers they give you. Stop looping when they enter a 0. Display the total at the end.
 * You must use a while loop.
 *
 * Example:
 * I will add up the numbers you give me.
 * Number: 6
 * The total so far is 6
 * Number: 9
 * The total so far is 15
 * Number: -3
 * The total so far is 12
 * Number: 2
 * The total so far is 14
 * Number: 0
 * The total is 14.
 *
 * */

import java.util.Scanner;

public class AddingValuesInLoop {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(" I will add up the numbers you give me.");
    int sumInteger = in.nextInt();
    while (sumInteger != 0) {
      System.out.println("The total so far is " + sumInteger);
      System.out.println("Number: ");
      int number = in.nextInt();
      sumInteger = number + sumInteger;
      if (number == 0) {
        break;
      }
    }
    System.out.println("The the total is: " + sumInteger);

  }

}
