public class Exercise {
  public static void main(String[] args) {
    // 0 1 2 3 4
    // l o c a l
    // String str = "local";

    // char[] chars = str.toCharArray();
    // boolean compare = chars[2] == str.charAt(2);

    // str.length();

    // exercise1();
    exercise2();
  }

  static void exercise1() {
    String pal = "ghostg";
    boolean correct = false;
    for (int ptr1 = 0, ptr2 = pal.length() - 1; ptr1 < pal.length() && ptr2 >= 0; ptr1++, ptr2--) {
      correct = pal.charAt(ptr1) == pal.charAt(ptr2);
      if (!correct) {
        break;
      }
    }
    System.out.println(correct);
    // System.out.println(pal);
  }

  static void exercise2() {
    // for (int i = 1; i <= 100; i++) {
    // if (i % 3 == 0)
    // System.out.println(i + "Fizz");
    // else if (i % 5 == 0)
    // System.out.println(i + "Buzz");
    // else if (i % 5 == 0 && i % 3 == 0)
    // System.out.println(i + "FizzBuzz");
    // }

    // System.out.println("Your solution");
    // for (int i = 1; i <= 100; i++) {
    // if (i % 3 == 0)
    // System.out.println(i + "Fizz");
    // if (i % 5 == 0)
    // System.out.println(i + "Buzz");
    // if (i % 5 == 0 && i % 3 == 0)
    // System.out.println(i + "FizzBuzz");
    // }

    for (int i = 1; i <= 100; i++) {
      if (i % 5 == 0 && i % 3 == 0)
        System.out.println(i + "FizzBuzz");
      else if (i % 3 == 0)
        System.out.println(i + "Fizz");
      else if (i % 5 == 0)
        System.out.println(i + "Buzz");
    }

  }
}
