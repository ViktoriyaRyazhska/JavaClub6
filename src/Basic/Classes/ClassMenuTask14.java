package Classes;

import java.util.Scanner;

public class ClassMenuTask14 implements Comparable<ClassMenuTask14> {
    Scanner scanner = new Scanner(System.in);
    private final long top;
    private final long bottom;
    long topNew;
    long bottomNew;

    public ClassMenuTask14(long numerator, long denominator) {
        this.top = numerator;
        this.bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((ClassMenuTask14) o) == 0;
    }

    @Override
    public int compareTo(ClassMenuTask14 f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    public long getTop() {
        return top;
    }

    public long getBottom() {
        return bottom;
    }

    public static long greatestCommonDivide(long a, long b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //Add two fractions
    public ClassMenuTask14 add(ClassMenuTask14 f2) {
        topNew = this.getTop() * f2.bottom + this.getBottom() * f2.top;
        bottomNew = this.getBottom() * f2.bottom;
        long div = greatestCommonDivide(topNew, bottomNew);
        topNew=topNew/div;
        bottomNew=bottomNew/div;
        System.out.println(topNew + "/" + bottomNew);
        return new ClassMenuTask14(topNew, bottomNew);
    }
}