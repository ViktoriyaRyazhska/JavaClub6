package main.Classes.Task6;
public class Block {
    // https://www.codewars.com/kata/building-blocks/

    private int width;
    private int length;
    private int height;

    public Block(int[] params) {
        this.width = params[0];
        this.length = params[1];
        this.height = params[2];
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
        return width * length * height;
     }

    public int getSurfaceArea() {
        return 2 * (width * length + length * height + height * width);
    }
}
