package Conditions;
/**   Task 7
 * @author wertylu*/
public class Task7
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        if(op == "+") return v1+v2;
        if(op == "/") return v1/v2;
        if(op == "*") return v1*v2;
        else return v1-v2;

    }
}
