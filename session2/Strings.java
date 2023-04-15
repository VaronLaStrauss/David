package session2;

public class Strings {
  public static void main(String[] args) {
    // Java is an object-oriented programming language
    String str1 = "I am Viany";
    System.out.println(str1);
    String str2 = new String("I am Viany");
    System.out.println(str2);

    System.out.println(str1 == "I am Viany");
    System.out.println(str2 == "I am Viany");

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    // Check address
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode("I am Viany"));
    System.out.println(System.identityHashCode(str2));

    char[] arr = str1.toCharArray();
    str1.toLowerCase(); // "i am viany"
    str1.toUpperCase(); // "I AM VIANY"

    // I am Viany
    // 0123456789
    String a = str1.substring(2, 3); // a
    a = a.toUpperCase(); // A
    System.out.println(a);

    String cap = str1.substring(0, 2) + a + str1.substring(3) + " " + "Manuel"; // I Am VianyManuel
    System.out.println(cap);

    // split, length, and charAt
    String name = "Viany Manuel";
    String[] names = name.split(" "); // "Viany", "Manuel"
    // "Viany" length 5, "Manuel" lenght 6
    // "01234", "012345"
    String firstname = names[0];
    String lastname = names[1];

    firstname.substring(0, firstname.length() - 1); // Vian
    firstname.charAt(firstname.length() - 1); // y
  }

  static void exercise() {
    // create a string with your full name in all lowercase letters

    // create a new string using the new String syntax with the same value as the
    // previous one

    // print the comparison of the two values

    // why are they different?

    // print the upper case of the first variable

    // separate the first variable into two variables, your first name and last name

    // convert the first name to all upper case except the last letter and store to
    // a variable

    // convert the last name to all lower case except the firt letter and store to a
    // variable

    // print the concatenation (+) in one println
  }
}
