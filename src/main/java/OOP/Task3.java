package OOP;

/**  Task 3 from OOP
 * @author RoSteik*/

public class Task3{
    private String copyOfSource = "" ;

    public String encode(String source){
        for (int i = 0; i<source.length(); i++) {

            switch(source.charAt(i)){
                case 'a':
                    copyOfSource += "4";
                    break;
                case 'e':
                    copyOfSource += "3";
                    break;
                case 'l':
                    copyOfSource += "1";
                    break;
                case 'm':
                    copyOfSource += "/";
                    copyOfSource += "^";
                    copyOfSource += "^";
                    copyOfSource += "\\";
                    break;
                case 'o':
                    copyOfSource += "0";
                    break;
                case 'u':
                    copyOfSource += "(";
                    copyOfSource += "_";
                    copyOfSource += ")";
                    break;
                default:
                    copyOfSource += source.charAt(i);
                    break;

            }
        }

        return copyOfSource;
    }

}

