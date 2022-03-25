package Conditions;

public class Task31 {

        public static int rentalCarCost(int d) {

            int sum = d*40;

            if(d>=7){
                sum-=50;
            } else if (d>=3){
                sum-=20;
            }
            return sum;
        }
    }

