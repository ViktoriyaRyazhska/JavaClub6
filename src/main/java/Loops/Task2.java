package Loops;

public class Task2 {

    private static int catYears;
    private static int dogYears;

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        if(humanYears >= 1) {
            if(humanYears == 1){
                catYears = 15;
                dogYears = 15;
            }
            if(humanYears == 2){
                catYears = 24;
                dogYears = 24;
            }
            if(humanYears > 2) {
                catYears = 24;
                dogYears = 24;
                for(int i = 0; i<humanYears-2; i++){
                    catYears+=4;
                    dogYears+=5;
                }
            }
        }


        else {
            System.out.println("humanYears must be >=1 ");
        }

        return new int[]{humanYears,catYears,dogYears};

    }

}