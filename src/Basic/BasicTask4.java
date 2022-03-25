import java.util.Scanner;

public class BasicTask4 {
    public static void isDivisible() {
        int wallLength,pixelSize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("            ---WELCOME---");
        System.out.println("You're laying out a rad pixel art mural to paint on your living room wall in homage to Paul Robertson, your favorite pixel artist.\n" +
                "\n" +
                "You want your work to be perfect down to the millimeter. You haven't decided on the dimensions of your piece,\n"+"how large you want your pixels to be, or which wall you want to use.\n"+"You just know that you want to fit an exact number of pixels.\n" +
                "\n" +
                "To help decide those things you've decided to write a function, is_divisible() that will tell you whether \n" +"a wall of a certain length can exactly fit an integer number of pixels of a certain length.\n" +
                "\n" +
                "Your function should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters.\n"+" It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False.\n"+" For example is_divisible(4050, 27) should return True, but is_divisible(4066, 27) should return False.");
        System.out.print("Put the data: wallLength= ");
        wallLength=scanner.nextInt();
        System.out.print("pixelSize= ");
        pixelSize=scanner.nextInt();
        if (wallLength % pixelSize == 0) {
            System.out.println(true);
        } else System.out.println(false);

    }
}
