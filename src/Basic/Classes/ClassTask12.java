package Classes;

public class ClassTask12 {
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

    public ClassTask12(){

    }
    private ClassTask12(int number, String stringValue, Object anObject){
        this.anObject=anObject;
        this.stringValue=stringValue;
        this.number=number;
    }
    public void result(){
        System.out.println("This Kata is a challenge created for you to learn how to use lombok " +
                "Giving the following class:\n" +
                "\n" +
                "public class EncapsulationDemo{\n" +
                "  public int number;\n" +
                "  public String stringValue;\n" +
                "  public Object anObject;\n" +
                "}\n" +
                "We have to do the following modifications to properly encapsulate info:\n" +
                "\n" +
                "-make fields private\n" +
                "-provide accessors to the internal fields ( setters/getters )\n" +
                "-provide an empty constructor to support Java Beans specification\n" +
                "-add a constructor that can receive parameters for all of the fields");
        System.out.println(new ClassTask12().toString());
    }
}