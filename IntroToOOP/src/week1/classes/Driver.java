package week1.classes;
/*
 * In your Driver class, create 3 rectangles with different sizes.
 * r1 = Width: 5, Height: 7, Color: Blue
 * r2 = Width: 10, Height: 2, Color: Green
 * r3 = Width: 15, Height: 12, Color: Red
 * Calling r1.draw(); will print the following.
 * BBBBB
 * BBBBB
 * BBBBB
 * BBBBB
 * BBBBB
 * BBBBB
 * BBBBB
 */

public class Driver {

  public static void main(String[] args) {

    Rectangle r1 = new Rectangle(5, 7, "Blue");
    Rectangle r2 = new Rectangle(10, 2, "Green");
    Rectangle r3 = new Rectangle(15, 12, "Red");
    System.out.print("R1:");
    r1.drawRectangle();
    System.out.print("\n" + "R2:");
    r2.drawRectangle();
    System.out.print("\n" + "R3:");
    r3.drawRectangle();
  }

}
