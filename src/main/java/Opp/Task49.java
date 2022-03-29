package Opp;


public class Task49 extends Encoder {

    public String encode(String source){
        String[] charsToReplace = new String[] {"A", "a", "E", "e", "L", "l", "M", "m", "O", "o", "U", "u"};
        String[] codeChars = new String[] {"4", "3", "1", "/^^\\", "0", "(_)" };

        if (source == null) {
            return "";
        } else {
            String out = source;
            for (int i = 0; i < charsToReplace.length; i++) {
                out = out.replace(charsToReplace[i], codeChars[i/2]);
            }
            return out;
        }

    }

}

abstract class Encoder{
    public abstract String encode(String source);
}