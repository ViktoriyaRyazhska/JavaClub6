package String;

public class Task10{
    public static String fakeBin(String numberString) {
        String copyOfNumberString = "";

        for (int i=0; i < numberString.length(); i++){

            if(Character.getNumericValue(numberString.charAt(i))<5){
                copyOfNumberString += "0";
                continue;
            }

            if(Character.getNumericValue(numberString.charAt(i))>=5){
                copyOfNumberString += "1";
                continue;
            }

            copyOfNumberString += numberString.charAt(i);

        }

        return copyOfNumberString;
    }
}