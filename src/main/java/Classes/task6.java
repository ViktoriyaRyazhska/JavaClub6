package Classes;

public class task6 {
    private int width;
    private int length;
    private int height;

    public task6(int[] params) {
        this.width = params[0];
        this.length = params[1];
        this.height = params[2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * width * length + 2 * length * height + 2 * height * width;
    }

    public static void main(String[] args) {
        task6 b = new task6(new int[] { 2, 4, 6 }); // -> creates a `Block` object with a width of `2` a length of `4`
                                                    // and a height of `6`
        System.out.println(b.getWidth()); // -> 2

        System.out.println(b.getLength()); // -> 4

        System.out.println(b.getHeight()); // -> 6

        System.out.println(b.getVolume()); // -> 48

        System.out.println(b.getSurfaceArea()); // -> 88
    }
}
