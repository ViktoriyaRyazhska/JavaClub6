package utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface Scanner {
    int readInt();

    long readLong();

    float readFloat();

    double readDouble();

    boolean readBoolean();

    String readString();

    char readChar();

    BigInteger readBigInteger();

    BigDecimal readBigDecimal();

    double[] readDoubleArray();

    int[] readIntArray();

    boolean[] readBooleanArray();

    String[] onlyForStockSummaryMethod();

    String[] readStringArray();
}
