package Classes;

//Task 3
public class Task3 implements Comparable<Task3>
{
    private final long top;
    private final long bottom;

    public Task3(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
    @Override
    public boolean equals(Object o) { return compareTo((Task3)o) == 0; }
    @Override
    public int compareTo(Task3 f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

    // Your work here!

    //Add two fractions
    static long gcd(long a, long b){
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }

    public Task3 add(Task3 f2) {
        long localTop  = this.top * f2.bottom + f2.top * this.bottom;
        long localBottom = this.bottom * f2.bottom;
        long gcd = gcd(localTop, localBottom);

        while(gcd != 1) {
            localTop /= gcd;
            localBottom /= gcd;
            gcd = gcd(localTop, localBottom);
        }

        return new Task3(localTop, localBottom);
    }

    @Override
    public String toString() {

        return this.top + "/" + this.bottom;
    }
}
