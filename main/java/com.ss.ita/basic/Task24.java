public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        int res;
        switch (op){
            case "+":
                res=v1+v2;
                break;
            case "-":
                res=v1-v2;
                break;
            case "*":
                res=v1*v2;
                break;
            case "/":
                res=v1/v2;
                break;
            default: res=0;
        }
        return res;
    }
}
