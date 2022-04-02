package String;

/**Task 3
 * @author sshaparenko*/

public class Task3 {
    public String sayHello(String [] name, String city, String state){
        String n = "";
        for (String a : name){
            n += a;
        }
        n = n.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");

        return "Hello, " + n + "! Welcome to " + city + ", " + state + "!";
    }

}
