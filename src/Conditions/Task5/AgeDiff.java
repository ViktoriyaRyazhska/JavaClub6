public class AgeDiff {
    // https://www.codewars.com/kata/how-old-will-i-be-in-2099/
    public static void main(String[] args) {
        System.out.println(CalculateAge(2012, 2013));
        System.out.println(CalculateAge(3400, 3400));
        System.out.println(CalculateAge(2012, 2011));
        System.out.println(CalculateAge(2012, 2023));
        System.out.println(CalculateAge(2023, 2012));
    }

    public static String CalculateAge(int birth, int yearTo) {
        int result = yearTo - birth;
        if (result == 0) {
            return "You were born this very year!";
        }
        if (result == 1) {
            return "You are 1 year old.";
        }
        if (result == -1) {
            return "You will be born in 1 year.";
        }
        if (result > 0) {
            return "You are " + result + " years old.";
        }
        return "You will be born in " + -result + " years.";
    }
}
