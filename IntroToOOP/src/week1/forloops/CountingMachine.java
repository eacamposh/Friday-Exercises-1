package week1.forloops;

/*
 * Counting Machine:
 * Write a program that gets an integer from the user. Count from 0 to that number. Use a for loop to do it.
 *
 * Example:
 * Count to: 19
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
 * */

import java.util.Scanner;

public class CountingMachine {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Count to: ");
    int number = in.nextInt();
    for (int i = 0; i <= number; i++) {
      System.out.print(i + "\t");
    }
  }
}
