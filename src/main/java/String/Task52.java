public class Kata {

    public static String solution(String str) {
        String res="";
        for(int i=str.length();i>0;i--){
            res+=str.charAt(i-1);
        }
        return res;
    }
}
