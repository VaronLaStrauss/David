package week0;

public class MathOperator {
  public static void main(String[] args) {
    // Mathematical operators
    // + - * / %
    int num1 = 13;
    int num2 = 4;
    float sum, diff, product, quotient, remainder;
    // int sum, diff, product, quotient, remainder;

    sum = num1 + num2; // 17
    diff = num1 - num2; // 9
    product = num1 * num2; // 52
    quotient = (float) (num1) / (int) (num2); // 3.25
    remainder = num1 % num2; // 1

    System.out.println(sum);
    System.out.println(diff);
    System.out.println(product);
    System.out.println(quotient);
    System.out.println(remainder);

    // PEMDAS
    System.out.println(sum * quotient + product / 3.0f);

    // Math class
    double pow2 = Math.pow(sum, 2);
    Math.sqrt(sum);
    Math.pow(sum, 1f / 3f);
  }
}
