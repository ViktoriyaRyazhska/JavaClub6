package utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface Scanner {
    int readInt();

    long readLong();

    float readFloat();

    double readDouble();

    String readString();

    BigInteger readBigInteger();

    BigDecimal readBigDecimal();

    double[] readDoubleArray();

    int[] readIntArray();

    String[] onlyForStockSummaryMethod();

    String[] readStringArray();
}
