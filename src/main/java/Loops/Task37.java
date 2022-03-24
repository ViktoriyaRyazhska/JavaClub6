package Loops;

public class Task37{

  public static int[] reverse(int n){

    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = n - i;
    }
    return array;
  }
}