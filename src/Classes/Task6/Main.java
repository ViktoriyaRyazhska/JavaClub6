public class Main {

    public static void main(String[] args) {
        Block b = new Block(new int[]{2,4,6});
        System.out.println(b.getWidth()); // -> 2
        System.out.println(b.getLength()); // -> 4
        System.out.println(b.getHeight()); // -> 6
        System.out.println(b.getVolume()); // -> 48
        System.out.println(b.getSurfaceArea()); // -> 88
    }

}
