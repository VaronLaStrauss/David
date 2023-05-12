package session5;

public class Methods {
  public static void main(String[] args) {

    String str = "david";

    char ch = str.charAt(0); // y

    char ch2 = charAt(0, str); // y

    // System.out.println(ch == ch2); // (y is equal to y) = true

    String reversed = reverseName(str);
    System.out.println(reversed); // david --> divad
    System.out.println(reversed.charAt(1));
  }

  /*
   * <modifier> <static?> <return_type> <name>(<parameter_list>) {
   * 
   * }
   */

  static char charAt(int index, String str) {
    char letter = str.charAt(index);
    return letter;
  }

  // example: david --> divad
  // what type is a name? it's a combination of characters, or essentialy a String
  static String reverseName(String name) {
    int length = name.length();
    String reversed = "";

    // anything less than 0, close the loop --> thinking might be dangerous
    // 4 < 0 = false!!! this would not run
    // anything greater than or equal to the first letter's index, we continue
    // 4 >= 0 = true!! this would run until 0 inclusive

    for (int i = length - 1; i >= 0; i--) {
      // "" -> "d" -> "di" -> "div"
      reversed = reversed + name.charAt(i);

    }

    // System.out.println(reversed);

    // returns divad should be!
    return reversed;
  }

  static String reverseName2(String name) {
    String reversed = "";

    // <type> <variable_name>: <array>
    // ['d', 'a', 'v', 'i', 'd']
    for (char letter : name.toCharArray()) {
      // "" -> "d" -> "ad" -> "vad" -> "ivad" -> "divad"
      reversed = letter + reversed;
    }

    return reversed;
  }
}
