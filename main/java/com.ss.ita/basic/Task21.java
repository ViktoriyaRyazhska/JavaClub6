public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {

    String template = "£%d";
    if (bonus) {
      return String.format(template, salary*10);
     } else {
       return String.format(template, salary);
    }
  }
}