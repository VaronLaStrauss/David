package session3;

public class ForLoop {
  public static void main(String[] args) {
    // (instantiation; equality check; increment/decrement)
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // Runs forever
    // for(;;){

    // }

    outer: for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println(i + "-" + j);
        if (i > j) {
          // break; //
          // continue; //
          break outer;
        }
      }
    }
  }
}
