package session5;

public class Exercise {
  public static void main(String[] args) {
    // call the method
    // branches(6);
    treeByHand(5);
  }

  // create a static method that creates a pine tree up to a certain depth by
  // calling the next method
  // at the end of the tree is a bark, print out "||"
  // when the depth is 5, it prints out:
  // *
  // * *
  // * * *
  // * * * *
  // * * * * *
  // ||

  static void branches(int depth) {
    for (int amountOfLeavesPerBranch = 1; amountOfLeavesPerBranch <= depth; amountOfLeavesPerBranch++) {
      leaf(amountOfLeavesPerBranch);
    }
    System.out.println("||");
  }

  // create a static method that prints out "* " (with the space) up to a certain
  // amount
  // e.g., when the amount is 3, it prints out "* * * "
  static void leaf(int amount) {
    for (int leaf = 1; leaf <= amount; leaf++) {
      System.out.print("* ");
    } // * * * * *
    System.out.println();
    // * * * * *
    //
  }

  // the tree we made with multiple methods is equivalent to this code:
  static void treeByHand(int depth) {
    for (int currentDepth = 1; currentDepth <= depth; currentDepth++) {
      for (int leaves = 1; leaves <= currentDepth; leaves++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
