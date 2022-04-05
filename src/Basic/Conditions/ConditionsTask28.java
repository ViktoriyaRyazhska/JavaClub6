package Conditions;

public class ConditionsTask28 {
    public static int enough(int cap, int on, int wait) {
        return Math.max(0, on + wait - cap);
    }
}
