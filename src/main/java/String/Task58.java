package String;

public class Task58 {
    public static String tripleTrouble(String one, String two, String three) {
        String[] parts1 = one.split("");
        String[] parts2 = two.split("");
        String[] parts3 = three.split("");
        String res = "";

        for(int i = 0; i < parts1.length; i++){
            res+=parts1[i]+parts2[i]+parts3[i];
        }
        return res;
    }
}
