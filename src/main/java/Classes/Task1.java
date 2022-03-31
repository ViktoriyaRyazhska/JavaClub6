package Classes;
/**   Task 1
 * @author wertylu*/

import lombok.*;
public class Task1{
    @Getter @Setter private int number;
    @Getter @Setter private String stringValue;
    @Getter @Setter private Object anObject;
    public Task1(){}
    public Task1(int number, String stringValue, Object anObject){
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }
}
