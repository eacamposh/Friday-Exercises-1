package Lab1;

public class prueba {

  public static void main(String[] args) {
    int a = 3;
    int b = 7;
    double result = Double.valueOf(b) / Double.valueOf(a);
    System.out.println("R: " + result);

    double heightInFeetAndInches = 87 / 12;
    String strHeight = Double.toString(heightInFeetAndInches);
    System.out.println("strHeight " + strHeight);
    String resa[] = strHeight.split("[.]", 0);
    System.out.println("R1: " + resa[0] + " R2: " + resa[1]);
  }


}
