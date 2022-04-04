package utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleScanner implements Scanner{

    private java.util.Scanner sc;

    public ConsoleScanner() {
        this.sc = new java.util.Scanner(System.in);
    }

    @Override
    public int readInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Value is not 'Integer', please try again.");
                sc.next();
            }
        }
    }

    @Override
    public long readLong() {
        while (true) {
            if (sc.hasNextLong()) {
                return sc.nextLong();
            } else {
                System.out.println("Value is not 'long', please try again.");
                sc.next();
            }
        }
    }

    @Override
    public float readFloat() {
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
            } else {
                System.out.println("Value is not 'float', please try again.");
                sc.next();
            }
        }
    }

    @Override
    public double readDouble() {
        while (true) {
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Value is not 'double', please try again.");
                sc.next();
            }
        }
    }
    @Override
    public boolean readBoolean(){
        while (true){
            if (sc.hasNextBoolean()){
                return sc.nextBoolean();
            }else{
                System.out.println("Value is not 'boolean', please try again.");
                sc.next();
            }
        }
    }
    @Override
    public String readString() {
        while (true) {
            if (sc.hasNext()) {
                return sc.nextLine();
            } else {
                System.out.println("Value is not 'String', please try again.");
                sc.next();
            }
        }
    }
    @Override
    public char readChar(){
        while (true){
            if(sc.hasNext()){
                return sc.next().charAt(0);
            } else {
                System.out.println("Value is not 'char', please try again.");
                sc.next();
            }
        }
    }

    @Override
    public BigInteger readBigInteger() {
        while (true) {
            if (sc.hasNextBigInteger()) {
                return new BigInteger(sc.nextLine());
            } else {
                System.out.println("Value is not 'BigInteger', please try again.");
                sc.next();
            }
        }
    }

    @Override
    public BigDecimal readBigDecimal() {
        while (true) {
            if (sc.hasNextBigDecimal()) {
                return new BigDecimal(sc.nextLine());
            } else {
                System.out.println("Value is not 'BigDecimal', please try again.");
                sc.next();
            }
        }
    }

    @Override
    public double[] readDoubleArray() {
        int size = 0;
        String input = sc.nextLine();
        List<String> resultList = new ArrayList<>(Arrays.asList(input.split(" ")));
        double[] result = new double[resultList.size()];

        while (size != resultList.size()) {
            if (new java.util.Scanner(resultList.get(size)).hasNextDouble()) {
                result[size] = Double.parseDouble(resultList.get(size));
                size++;
            } else {
                System.out.println("Value " + resultList.get(size) + " is not Double, please try again.");
                resultList.set(size, sc.next());
            }
        }
        return result;
    }

    @Override
    public int[] readIntArray() {
        int size = 0;
        String input = sc.nextLine();
        List<String> resultList = new ArrayList<>(Arrays.asList(input.split(" ")));
        int[] result = new int[resultList.size()];

        while (size != resultList.size()) {
            if (new java.util.Scanner(resultList.get(size)).hasNextInt()) {
                result[size] = Integer.parseInt(resultList.get(size));
                size++;
            } else {
                System.out.println("Value " + resultList.get(size) + " is not Integer, please try again.");
                resultList.set(size, sc.next());
            }
        }
        return result;
    }
    @Override
    public boolean[] readBooleanArray(){
        int size = 0;
        String input = sc.nextLine();
        List<String> resultList = new ArrayList<>(Arrays.asList(input.split(" ")));
        boolean[] result = new boolean[resultList.size()];
        while (size != resultList.size()) {
            if (new java.util.Scanner(resultList.get(size)).hasNextBoolean()) {
                result[size] = Boolean.parseBoolean(resultList.get(size));
                size++;
            } else {
                System.out.println("Value " + resultList.get(size) + " is not Boolean, please try again.");
                resultList.set(size, sc.next());
            }
        }
        return result;
    }
    @Override
    public String[] onlyForStockSummaryMethod() {
        String input = sc.nextLine();
        String[] chars = input.split("");
        String temp = "";

        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                if (new java.util.Scanner(chars[i]).hasNextInt() && chars[i + 1].equals(" ")) {
                    chars[i + 1] = "!";
                }
            }
        }
        for (String aChar : chars) {
            temp = temp.concat(aChar);
        }

        return temp.split("!");
    }

    @Override
    public String[] readStringArray() {
        return sc.nextLine().split(" ");
    }


}
