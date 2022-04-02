package OOP;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(Dih4.REFLECT_REVERSE_DIAGONAL == Dih4.ROTATE_90_CLOCKWISE.then(Dih4.REFLECT_VERTICAL));
    }
}

enum Action {
    Rotation, Reflection, Identity;
}

enum Direction {
    Clockwise, Anticlockwise
}

enum Reflection {
    Vertical, ForwardDiagonal, Horizontal, ReverseDiagonal
}

class Dih4 {
    static Dih4 IDENTITY = new Dih4(Action.Identity);
    static Dih4 ROTATE_90_ANTICLOCKWISE = new Dih4(Action.Rotation, Direction.Anticlockwise, 90);
    static Dih4 ROTATE_180 = new Dih4(Action.Rotation, 180);
    static Dih4 ROTATE_90_CLOCKWISE = new Dih4(Action.Rotation, 90);
    static Dih4 REFLECT_VERTICAL = new Dih4(Action.Reflection);
    static Dih4 REFLECT_FORWARD_DIAGONAL = new Dih4(Action.Reflection);
    static Dih4 REFLECT_HORIZONTAL = new Dih4(Action.Reflection);
    static Dih4 REFLECT_REVERSE_DIAGONAL = new Dih4(Action.Reflection);

    private int degrees = 0;
    private Direction direction = Direction.Clockwise;
    private Action action = Action.Rotation;

    public Dih4(Action iAction) {
        action = iAction;
    }

    public Dih4(Action iAction, int iDegrees) {
        action = iAction;

        if (action == Action.Reflection) {
            degrees = 360 - iDegrees;
        } else {
            degrees = iDegrees;
        }
    }

//    public Dih4(Action iAction, Reflection iReflection) {
//        action = iAction;
//        degrees = 360 - degrees;
//        switch (iReflection) {
//           case Vertical:
//               degrees = 360 - degrees;
//               break;
//           case ForwardDiagonal:
//
//           case Horizontal:
//           case ReverseDiagonal:
//               break;
//       }
//    }

    public Dih4(Action iAction, Direction iDirection, int iDegrees) {
        action = iAction;
        direction = iDirection;
        degrees = iDegrees;
    }

    Dih4 then(Dih4 other) {
        if (other.is_rotation()) {
            if (other.direction == Direction.Clockwise) {
                degrees += other.degrees;
            } else {
                degrees -= other.degrees;
            }
            return this.cutAngles();
        } else if (other.is_reflection()) {
            return new Dih4(Action.Reflection, degrees).cutAngles();
        } else {
            return this.cutAngles();
        }
    }

    Dih4 inv() {
        if (action == Action.Rotation) {
            if (direction == Direction.Clockwise) {
                direction = Direction.Anticlockwise;
            } else {
                direction = Direction.Clockwise;
            }
        }
        return this;
    }

    boolean is_rotation() {
        return action == Action.Rotation;
    }

    boolean is_reflection() {
        return action == Action.Reflection;
    }

    Dih4 cutAngles() {
        while (degrees > 360) {
            degrees -= 360;
        }

        while (degrees < 0) {
            degrees += 360;
        }

        return this;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Dih4) {
            result = degrees == ((Dih4) obj).degrees && action == ((Dih4) obj).action && direction == ((Dih4) obj).direction;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Degrees: " + degrees + " Action: " + action + " Direction: " + direction;
    }
}

