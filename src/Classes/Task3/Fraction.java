package Classes.Task3;

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    //Найб. Сп. Дільник
    long gcd(long a, long b){
        if (a == 0){
            return b;
        }
        else {
            return gcd(b%a, a);
        }
    }


    //Add two fractions
    public Fraction add(Fraction f2) {

        long den3 = gcd(bottom,f2.bottom);

        den3 = (bottom*f2.bottom) / den3;

        long num3 = (top)*(den3/bottom) + (f2.top)*(den3/ f2.bottom);

        long common_factor = gcd(num3,den3);
        den3 = den3/common_factor;
        num3 = num3/common_factor;

        return new Fraction(num3, den3);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
