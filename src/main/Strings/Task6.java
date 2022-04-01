package main.Strings;

public class Task6 {
    public static void main(String[] args) {
        BanjoPlay("rodger");
    }
    public  static void BanjoPlay(String name){
        if (name.startsWith("R")||name.startsWith("r")){
            System.out.println(name+" plays banjo");
        }else System.out.println(name+" does not play banjo");
    }
}
