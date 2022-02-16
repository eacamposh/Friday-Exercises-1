package week1.classes;

import java.util.Scanner;

public class Rectangle {

  private Integer width;
  private Integer height;
  private String color;

  public Rectangle() {
  }

  public Rectangle(Integer width, Integer height, String color) {
    this.width = width;
    this.height = height;
    this.color = color;
  }

  public Integer getHeight() {
    return height;
  }

  public Integer getWidth() {
    return width;
  }

  public String getColor() {
    return color;
  }

  // Width has to be greater than 0, and it is an integer. (otherwise set the width to 1)
  public void setWidth(Integer width) {
    if (width > 0) {
      this.width = width;
    } else {
      this.width = 1;
    }

  }

  // Height has to be greater than 0, and it is an integer. (otherwise set the height to 1)
  public void setHeight(Integer height) {
    if (height > 0) {
      this.height = height;
    } else {
      this.height = 1;
    }
  }

  // Color has to be Capitalized and more than 2 characters long and less than 20.
  // Default color is “Blue” (String)
  public void setColor(String color) {
    Scanner in = new Scanner(color);
    String colorInCapitalized = "";
    if (color.length() > 2 & color.length() < 20) {
      while (in.hasNext()) {
        String colorWord = in.next();
        colorInCapitalized = String.format("%s%s%s ", colorInCapitalized,
            Character.toUpperCase(colorWord.charAt(0)),
            colorWord.substring(1));
      }
      this.color = colorInCapitalized;
    } else {
      this.color = "Blue";
    }
  }

  public void drawRectangle() {
    String colorRectangle = getColor().substring(0, 1);
    for (int i = 1; i <= getHeight(); i++) {
      System.out.print("\n" + colorRectangle);
      for (int j = 1; j < getWidth(); j++) {
        System.out.print(colorRectangle);

      }
    }
  }

}
