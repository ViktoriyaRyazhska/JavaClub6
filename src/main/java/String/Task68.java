/*
public static String remove(String s, int n){

        char ss[]  = s.toCharArray();
        int tmp=0;
        if(n>ss.length){n=ss.length;}
        while(n>0) {
        int counter=0;
        for (int i=0;i<s.length();i++){
        if(Character.compare(s.charAt(i),'!')==0)  counter++;
        }
        if(counter!=0&n!=0) {

        int a=String.valueOf(ss).indexOf(33);
        if (a==-1)break;
        for (int i=a;i<ss.length;i++){
        if(i==ss.length-1){
        ss[i]=' ';
        }
        else ss[i]=ss[i+1];

        }
        tmp++;
        n--;
        }
        }
        char []newArr = new char[ss.length -tmp];
        for(int i = 0; i < newArr.length; i++){
        newArr[i] = ss[i];
        }
        return String.valueOf(newArr);
        }

        }

 */
