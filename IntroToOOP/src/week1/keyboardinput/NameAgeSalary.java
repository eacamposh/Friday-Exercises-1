package week1.keyboardinput;

import java.util.Scanner;

/**
 * Name, Age, and Salary:
 * <p>
 * Ask the user for their name. Then display their name to prove that you can recall it. Ask them
 * for their age. Then display that. Finally, ask them for how much they make and display that. You
 * should use the most appropriate data type for each variable.
 * <p>
 * Example: Hello.  What is your name? Dennis Hi, Dennis!  How old are you? 37 So you're 37, eh?
 * That's not old at all! How much do you make, Dennis? 8.50 8.5!  I hope that's per hour and not
 * per year! LOL!
 */

public class NameAgeSalary {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello. What is your name? ");
    String name = in.nextLine();
    System.out.println("Hi, " + name + "!" + " How old are you? ");
    int age = in.nextInt();
    System.out.println("So you're " + age + ", eh?  That's not old at all!");
    System.out.println("How much do you make, " + name + "?");
    double salary = in.nextDouble();
    System.out.println(salary + "! I hope that's per hour and not per year! LOL!");


  }

}
