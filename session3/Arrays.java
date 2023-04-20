package session3;

public class Arrays {
  public static void main(String[] args) {
    String name = "David Mellor";
    char[] lettersOfMyName = name.toCharArray(); // ['D', 'a', 'v', ...]
    System.out.println(lettersOfMyName); // David ...

    // -------------- 0, 1, 2, 3, 4, 5
    int[] numbers = { 3, 4, 6, 8, 2, 3 };
    int[] numbersUnknown = new int[6]; // neutral values for primitive data types [0,0,0]
    String str = new String();

    System.out.println(numbers);
    System.out.println(numbersUnknown);

    String[] strArr = new String[10]; // object data types: [null, null, null, null, ...]

    System.out.println(numbers[2]);
    numbers[2] = numbers[4] + 10; // 12
    System.out.println(numbers[2]);

    System.out.println(strArr[0]);
    System.out.println(numbersUnknown[0]);

    boolean[] bool = new boolean[4];
    System.out.println(bool[0]);
  }
}
