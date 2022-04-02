package Classes;

public class Task3 {

    public class Fraction implements Comparable<Fraction> {
        private final long top;
        private final long bottom;

        public Fraction(long numerator, long denominator) {
            top = numerator;
            bottom = denominator;
        }

        @Override
        public int hashCode() {
            return 17 * Long.hashCode(top) + Long.hashCode(bottom);
        }

        @Override
        public boolean equals(Object o) {
            return compareTo((Fraction) o) == 0;
        }

        @Override
        public int compareTo(Fraction f2) {
            return Long.compare(top * f2.bottom, f2.top * bottom);
        }

        public Fraction add(Fraction f2) {
            long commonDenominator = Math.nok(f2.bottom, bottom);
            long commonNumerator = (((commonDenominator / bottom) * top) + ((commonDenominator / f2.bottom) * f2.top));
            Fraction finalFraction = Math.abbreviation(commonNumerator, commonDenominator);
            return finalFraction;
        }

        @Override
        public String toString() {
            return (top + "/" + bottom);
        }
    }

    static class Math {
        static long nok(long a, long b) {
            return a * b / nod(a, b);
        }

        static long nod(long a, long b) {
            if (b == 0) {
                return a;
            }
            return nod(b, a % b);
        }

        static Fraction abbreviation(long top, long bottom) {
            boolean isRunning = true;
            int check = 0;
            while (isRunning) {
                for (long i = 9; i > 1; --i) {
                    if (top % i == 0 && bottom % i == 0) {
                        top /= i;
                        bottom /= i;
                        ++check;
                    }
                }

                if (check == 0) {
                    isRunning = false;
                } else {
                    check = 0;
                }
            }

            return new Fraction(top, bottom);
        }
    }
}
