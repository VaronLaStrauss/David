package session3;

public class ForLoop {
  public static void main(String[] args) {
    // // (instantiation; equality check; increment/decrement)
    // for (int i = 0; i < 10; i++) {
    // System.out.println(i);
    // }

    // for (int i = 10; i <= 0; i--) {
    // System.out.println(i);
    // }.

    // // Runs forever
    // // for(;;){

    // // }

    // outer: for (int i = 0; i < 10; i++) {
    // for (int j = 0; j < 10; j++) {
    // System.out.println(i + "-" + j);
    // if (i > j) {
    // // break; //
    // // continue; //
    // break outer;
    // }
    // }
    // }

    // variable scoping
    int seconds = 0;
    int minutes = 0;
    for (int hours = 2; hours >= 0; hours--) {
      for (; minutes >= 0; minutes--) {
        // System.out.println(hours + ":" + minutes + ":" + seconds);
        for (; seconds >= 0; seconds--) {
          if (seconds < 10) {
            System.out.print(hours + ":" + minutes + ":0" + seconds + "\t");
          } else {
            System.out.print(hours + ":" + minutes + ":" + seconds + "\t");
          }
        }
        if (seconds == -1) {
          seconds = 59;
        }
      }

      if (minutes == -1) {
        minutes = 59;
      }
    }
  }

  void exercise() {
    // <hh>:<mm>:<ss>
    // 1:59:20
    // 1:59:19
    // 1:59
    // 1:58
    // ...
    // 1:00
    // 0:59
  }
}
