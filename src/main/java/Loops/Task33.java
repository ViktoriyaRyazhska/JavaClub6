package Loops;

public class Task33 {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    // Your code here!
    int catYears = 0;
    int dogYears = 0;

    for (int i = 1; i <= humanYears; i++) {
      if (i == 1) {
        catYears+=11;
        dogYears+=10;
      }
      if (i == 2) {
        catYears+=5;
        dogYears+=4;
      }

      catYears+=4;
      dogYears+=5;

    }
    return new int[]{humanYears,catYears,dogYears};
  }
}