package Classes;

public class Task12 {
    private int number;
    private String stringValue;
    private Object anObject;

    int getNumber(){
        return this.number;
    }
    String getStringValue(){
        return this.stringValue;
    }
    Object getAnObject(){
        return this.anObject;
    }

    void setNumber(int number){
        this.number=number;
    }
    void setStringValue(String stringValue){
        this.stringValue=stringValue;
    }
    void setAnObject(Object anObject){
        this.anObject=anObject;
    }

    public Task12(){

    }
    private Task12(int number, String stringValue, Object anObject){
        this.anObject=anObject;
        this.stringValue=stringValue;
        this.number=number;
    }
}
