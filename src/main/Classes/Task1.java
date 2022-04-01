package main.Classes;

import java.util.Objects;

public class Task1 {
    private int number;
    private String stringValue;
    private Object anObject;

    public Task1() {
    }

    public Task1(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task1 task1 = (Task1) o;
        return number == task1.number &&
                Objects.equals(stringValue, task1.stringValue) &&
                Objects.equals(anObject, task1.anObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, stringValue, anObject);
    }
}
