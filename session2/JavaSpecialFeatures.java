package session2;

public class JavaSpecialFeatures {
  public static void main(String[] args) {
    // equations are different from math than in programming languages
    int i = 10; // 10
    i = i + 1; // 11

    // the not (!) symbol can be used alongside variables
    boolean isACar = true;
    boolean isNotACar = !isACar;

    // for numeric data types (int, float, double, short, long), there are two
    // symbols that automaticall adds 1 or subtracts 1 from the variable
    i++;
    ++i; // similar to i = i + 1; // 12 13
    i--;
    --i; // similar to i = i - 1; // 12 11
    System.out.println(i);
    // Current value = 11
    // System.out.println(i-- + ++i); // 10 + 12 = 23
    System.out.println(--i + ++i); // 10 + 11 = 21
    System.out.println(i);

    // shorthand equations
    i += 2; // i = i + 2
    i -= 2;
    i *= 2;
  }

  static void exercise() {
    // create a float with a value of 13.5, print

    // multiply 3 * 4 to the previous variable with shorthand equation, print

    // subtract 1 to the previous variable three times, print

    // create a boolean that compares the variable to 156, print

    // print the opposite of the boolean
  }
}
