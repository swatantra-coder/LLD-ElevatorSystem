public class Display {
    int floor;
    Direction direction;

    public Display(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void display() {
        System.out.println("Floor: " + floor + " Direction: " + direction);
    }
}
