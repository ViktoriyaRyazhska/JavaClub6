package OOP;

public class Task48 {
    enum Act {
        Rotation, Reflection, Identity;
    }

    enum Direction {
        Clockwise, Anticlockwise
    }

    enum Reflection {
        Vertical, ForwardDiagonal, Horizontal, ReverseDiagonal
    }


    public static Task48 IDENTITY = new Task48(Act.Identity);
    public static Task48 ROTATE_90_ANTICLOCKWISE = new Task48(Act.Rotation, Direction.Anticlockwise, 90);
    public static Task48 ROTATE_180 = new Task48(Act.Rotation, 180);
    public static Task48 ROTATE_90_CLOCKWISE = new Task48(Act.Rotation, 90);
    public static Task48 REFLECT_VERTICAL = new Task48(Act.Reflection);
    public static Task48 REFLECT_FORWARD_DIAGONAL = new Task48(Act.Reflection);
    public static Task48 REFLECT_HORIZONTAL = new Task48(Act.Reflection);
    public static Task48 REFLECT_REVERSE_DIAGONAL = new Task48(Act.Reflection);

        private int degrees = 0;
        private Direction direction = Direction.Clockwise;
        private Act act = Act.Rotation;

        public Task48(Act iAction) {
            act = iAction;
        }

        public Task48(Act iAction, int iDegrees) {
            act = iAction;

            if (act == Act.Reflection) {
                degrees = 360 - iDegrees;
            } else {
                degrees = iDegrees;
            }
        }


        public Task48(Act iAct, Direction iDirection, int iDegrees) {
            act = iAct;
            direction = iDirection;
            degrees = iDegrees;
        }

    public Task48 then(Task48 other) {
            if (other.is_rotation()) {
                if (other.direction == Direction.Clockwise) {
                    degrees += other.degrees;
                } else {
                    degrees -= other.degrees;
                }
                return this.cutAngles();
            } else if (other.is_reflection()) {
                return new Task48(Act.Reflection, degrees).cutAngles();
            } else {
                return this.cutAngles();
            }
        }

    public Task48 inv() {
            if (act == Act.Rotation) {
                if (direction == Direction.Clockwise) {
                    direction = Direction.Anticlockwise;
                } else {
                    direction = Direction.Clockwise;
                }
            }
            return this;
        }

    public boolean is_rotation() {
            return act == Act.Rotation;
        }

    public  boolean is_reflection() {
            return act == Act.Reflection;
        }

        Task48 cutAngles() {
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

            if (obj instanceof Task48) {
                result = degrees == ((Task48) obj).degrees && act == ((Task48) obj).act && direction == ((Task48) obj).direction;
            }

            return result;
        }

        @Override
        public String toString() {
            return "Degrees: " + degrees + " Act: " + act + " Direction: " + direction;
        }
    }
