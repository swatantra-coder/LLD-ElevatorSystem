import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upQueue;
    PriorityQueue<Integer> downQueue;

    ElevatorCar car;

    public ElevatorController(ElevatorCar car) {
        upQueue = new PriorityQueue<>();
        downQueue = new PriorityQueue<>((a, b) -> b - a);
        this.car = car;
    }
}

