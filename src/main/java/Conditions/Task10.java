package Conditions;

/**     Task 10
 * @author RoSteik*/

public class Task10 {
    private static int emptySeatsInBus;
    public static int enough(int capacity, int numberOfPeopleOnBus, int numberOfPeopleWhoWaitOnBus){
        emptySeatsInBus = capacity - numberOfPeopleOnBus;
        //If there is enough space, return 0,
        // and if there isn't, return the number of passengers he can't take.
        if(emptySeatsInBus >= numberOfPeopleWhoWaitOnBus){
            return 0;
        }
        return numberOfPeopleWhoWaitOnBus - emptySeatsInBus;

    }
}
