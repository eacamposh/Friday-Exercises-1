package week1.keyboardinput;

/*
 * Age in Five Years:
 * Ask the user for their name. Then display their name to prove that you can recall it.
 * Ask them for their age. Then display what their age would be five years from now.
 * Then display what their age would be five years ago.
 *
 * Example:
 * Hello.  What is your name? Percy_Bysshe_Shelley
 * Hi, Percy_Bysshe_Shelley!  How old are you? 34
 * Did you know that in five years you will be 39 years old?
 * And five years ago you were 29! Imagine that!
 * * */

import java.util.Scanner;

public class AgeInFiveYears {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hello. What is your name? ");
    String name = in.nextLine();
    System.out.println("Hi, " + name + "! How old are you?");
    int age = in.nextInt();
    System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
    System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
  }
}
