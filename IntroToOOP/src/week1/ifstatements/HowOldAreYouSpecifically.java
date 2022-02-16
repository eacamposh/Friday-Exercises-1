package week1.ifstatements;

/*
 * How Old Are You, Specifically?
 * Using if statements, else if, and else statements, make a program which displays a different message depending on the age given.
 * Note that unlike the original "How Old Are You" assignment,
 * this program must only display exactly one message for a given age and not multiple messages.
 *
 * Example:
 * Hey, what's your name? (Sorry, I keep forgetting.) Billy_Corgan
 * Ok, Billy_Corgan, how old are you? 17
 * You can drive, but you can't vote, Billy_Corgan.
 *
 * You can make up your own messages if you want, but you must have at least four messages,
 * and you must use else if statements to make sure only one of the messages is printed for any given age.
 * */

import java.util.Scanner;

public class HowOldAreYouSpecifically {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello. What is your name? (Sorry, I keep forgetting.)");
    String name = in.nextLine();
    System.out.println("Ok, " + name + ", how old are you?");
    int age = in.nextInt();
    if (age < 16) {
      System.out.println("You can't drive.");
    }
    if (age >= 16 & age <= 17) {
      System.out.println("You can drive but not vote.");
    }
    if (age >= 18 & age <= 24) {
      System.out.println("You can vote but not rent a car.");
    } else if (age >= 25) {
      System.out.println("You can do pretty much anything");
    }
  }
}

