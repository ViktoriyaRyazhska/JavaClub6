package Classes;

public class ClassTask17 {
    private final int width;
    private final int length;
    private final int height;

    public ClassTask17(int... corners) {
        this.width = corners[0];
        this.length = corners[1];
        this.height = corners[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        return 2 * (length * height + length * width + height * width);
    }
}
