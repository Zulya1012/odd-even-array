public class arrAy {
  public static void main(String[] arg) {
    int[] arr = {
      2,
      5,
      8,
      7,
      10
    };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        count++;
      }

    }

    System.out.println("Odd number array: " + (arr.length - count));

    System.out.println("Even number array: " + count);

  }
}
