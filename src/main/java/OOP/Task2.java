package OOP;

public class Task2{
    enum Act{
        Rotation, Reflection, Identity;
    }
    enum Direction{
        Clockwise, Anticlockwise
    }
    enum Reflection{
        Vertical, ForwardDiagonal, Horizontal, ReverseDiagonal
    }
    static Task2 IDENTITY = new Task2(Act.Identity);
    static Task2 ROTATE_90_ANTICLOCKWISE = new Task2(Act.Rotation, Direction.Anticlockwise, 90);
    static Task2 ROTATE_180 = new Task2(Act.Rotation, 180);
    static Task2 ROTATE_90_CLOCKWISE = new Task2(Act.Rotation, 90);
    static Task2 REFLECT_VERTICAL = new Task2(Act.Reflection);
    static Task2 REFLECT_FORWARD_DIAGONAL = new Task2(Act.Reflection);
    static Task2 REFLECT_HORIZONTAL = new Task2(Act.Reflection);
    static Task2 REFLECT_REVERSE_DIAGONAL = new Task2(Act.Reflection);
    private int degrees = 0;
    private Direction direction = Direction.Clockwise;
    private Act act = Act.Rotation;
    public Task2(Act iAction){
        act = iAction;
    }
    public Task2(Act iAction, int iDegrees){
        act = iAction;
        if (act == Act.Reflection){
            degrees = 360 - iDegrees;
        } else {
            degrees = iDegrees;
        }
    }


    public Task2(Act iAct, Direction iDirection, int iDegrees){
        act = iAct;
        direction = iDirection;
        degrees = iDegrees;
    }
    Task2 then(Task2 other){
        if (other.is_rotation()){
            if (other.direction == Direction.Clockwise){
                degrees += other.degrees;
            } else {
                degrees -= other.degrees;
            }
            return this.cutAngles();
        } else if (other.is_reflection()){
            return new Task2(Act.Reflection, degrees).cutAngles();
        } else {
            return this.cutAngles();
        }
    }
    Task2 inv(){
        if (act == Act.Rotation){
            if (direction == Direction.Clockwise){
                direction = Direction.Anticlockwise;
            } else {
                direction = Direction.Clockwise;
            }
        }
        return this;
    }
    boolean is_rotation(){
        return act == Act.Rotation;
    }
    boolean is_reflection(){
        return act == Act.Reflection;
    }
    Task2 cutAngles(){
        while (degrees > 360) {
            degrees -= 360;
        }
        while (degrees < 0){
            degrees += 360;
        }
        return this;
    }
    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if (obj instanceof Task2){
            result = degrees == ((Task2) obj).degrees && act == ((Task2) obj).act && direction == ((Task2) obj).direction;
        }
        return result;
    }
    @Override
    public String toString(){
        return "Degrees: " + degrees + " Act: " + act + " Direction: " + direction;
    }
}
