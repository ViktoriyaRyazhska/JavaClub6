package Loops;

class Task45 {

    public static long[] gap(int g, long m, long n) {

      long[] ans = new long[2];
      long num = 0;

      for (long x = m; x <= n; x++) {
        if (isPrime(x)) {
          if (num != 0 && x - num == g) {
            ans[0] = num;
            ans[1] = x;
            break;
          } else {
            num = x;
          }
        }
      }

      if(ans[0] == 0) {
        return null;
      } else {
        return ans;
      }
    }


  public static boolean isPrime(long x){
    boolean check = true;
    if (x % 2 == 0) {
      check = false;
    } else {
      for (int i = 3; i <= Math.sqrt(x); i += 2) {
        if (x % i == 0) {
          check = false;
        }
      }
    }
    return check;
  }

}