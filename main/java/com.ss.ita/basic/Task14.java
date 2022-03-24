public class Task14 implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Task14(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!
    public long getTop() {
        return top;
    }

    public long getBottom() {
        return bottom;
    }

    public long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }

    //Add two fractions
    public Fraction add(Fraction f2) {
        long newNumerator = (getBottom() == f2.getBottom()) ? getTop() + f2.getTop()  : getTop() * f2.getBottom() + f2.getTop() * getBottom();
        long newDenominator = (getBottom() == f2.getBottom()) ? getBottom() : getBottom() * f2.getBottom();

        long g = gcd(newNumerator, newDenominator);
        newNumerator /= g;
        newDenominator /= g;

        return new Task14(newNumerator, newDenominator);
    }

    //...and make this class string representable
    public String toString() {
        return top + "/" + bottom;
    }
}
