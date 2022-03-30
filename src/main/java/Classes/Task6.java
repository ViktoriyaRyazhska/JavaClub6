package Classes;

public class Task6 {
}
class Block{
    private int width;
    private int length;
    private int height;
    Block(int[] proportions){
        setWidth(proportions[0]);
        setLength(proportions[1]);
        setHeight(proportions[2]);
    }
    void setWidth(int Width){
        width = Width;
    }
    void setLength(int Length){
        length = Length;
    }
    void setHeight(int Height){
        height = Height;
    }
    int getWidth(){
        return width;
    }
    int getLength(){
        return length;
    }
    int getHeight(){
        return height;
    }
    int getVolume(){
        return width * height * length;
    }
    int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
    }
}
