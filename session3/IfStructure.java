package session3;

public class IfStructure {
  public static void main(String[] args) {
    int[] nums = { 10, 20, 30 };
    // 10 <= 10
    // if (10 <= 10) {
    // System.out.println("Yay!");
    // } else {
    // System.out.println("Nay!");
    // }

    // if (9 < 10) {
    // System.out.println("Yay!");
    // } else {
    // System.out.println("Nay!");
    // }

    // // 10 > 20
    // if (nums[0] > nums[1]) {
    // System.out.println("Yay!");
    // } else {
    // System.out.println("Nay!");
    // }

    // // 10 > 20
    // if (nums[0] > nums[1]) {
    // System.out.println("Yay!");
    // }
    // // 10 < 30
    // else if (nums[0] > nums[2]) {
    // System.out.println("Hmm!");
    // } else {
    // System.out.println("Nay!");
    // }

    if (nums[0] > 7 && nums[0] <= 10) {
      System.out.println("Yay!");
    } else {
      System.out.println("Nay!");
    }

    if (nums[0] > 7 || nums[0] < 10) {
      System.out.println("Yay!");
    } else {
      System.out.println("Nay!");
    }

    // Hierarchy: !, &&, ||
    // Short circuiting
    if (nums[0] > 7 && nums[0] < 10 || nums[0] <= 20) {
      System.out.println("Yay!");
    } else {
      System.out.println("Nay!");
    }

  }

  void exercise() {
    // create a grade comparison using if else
    // all grade values are inclusive and is always whole numbers
    // 100-96: A
    // 95-90: B
    // 89-86: C
    // 85-75: D
    // 75-0: F
    // All other numbers print "That's not a grade!"
  }
}
