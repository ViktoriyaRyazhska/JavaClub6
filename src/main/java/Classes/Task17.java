package Classes;

public class Task17{

  final int width;
  final int length;
  final int height;

  public Task17(int[] array){

    this.width = array[0];
    this.length = array[1];
    this.height = array[2];

  }

  public int getWidth() {
    return this.width;
  }

  public int getLength() {
    return this.length;
  }

  public int getHeight() {
    return this.height;
  }

  public int getVolume() {
    return this.width * this.length * this.height;
  }

  public int getSurfaceArea() {
    int a = this.length * this.width;
    int b = this.length * this.height;
    int c = this.width * this.height;

    return 2 * (a + b + c);

  }
}