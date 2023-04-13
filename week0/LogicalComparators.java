package week0;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LogicalComparators {
  public static void main(String[] args) {
    // >, <, >=, <=, ==, !=
    boolean bool = 1 > 2; // false
    bool = 2 < 3; // true
    bool = 2 >= 2f; //
    bool = 0.3 == 0.2 + 0.1; // false because 0.2+0.1 = 0.30-4;
    bool = 0.3 != 0.3; // false;
    // bool = 0.4 > 2 && 0.4 > 1; false // How to use logical operators: &&, ||, !

    System.out.println(bool);
  }

  // to fix the issue with 0.2+0.1=0.3000004, we need to use this method:
  static double toTwoDecimalPlaces(double decimal) {
    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.DOWN);
    String s = df.format(decimal);
    return Double.parseDouble(s);
  }
}
