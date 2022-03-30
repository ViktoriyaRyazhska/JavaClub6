public class Task5 {
    public static void main(String[] args) {

    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sheepCount = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) sheepCount++;
        }

        return sheepCount;
    }
}