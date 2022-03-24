public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] reversedArr = new String[arr.length];
    for (int i = 0; i < reversedArr.length; i++){
      reversedArr[i] = arr[arr.length - 1 - i];
    }
    return reversedArr;
  }
}