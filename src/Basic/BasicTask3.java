import java.util.Scanner;

public class BasicTask3 {
    public static void getVolumeOfCuboid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid."+"\n"+" Write a function to help Bob with this calculation.");
        System.out.print("Put the data,length= ");
        final double length=scanner.nextDouble();
        System.out.print("width= ");
        final double width=scanner.nextDouble();
        System.out.print("height=");
        final double height=scanner.nextDouble();
        System.out.println("volume="+length*width*height);
    }



}
