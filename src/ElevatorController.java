import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upQueue;
    PriorityQueue<Integer> downQueue;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upQueue = new PriorityQueue<>();
        downQueue = new PriorityQueue<>((a,b)->b-a); //reverse order
    }

    public void submitExternalRequest(int floor, Direction direction){
        if(direction==Direction.DOWN){
            upQueue.add(floor);
        }else{
            downQueue.add(floor);
        }
    }

    public void submitInternalRequest(int floor){
        if(direction==Direction.DOWN.toString()){
            upQueue.add(floor);
        }else{
            downQueue.add(floor);
        }
    }

    public void operateElevator(){
        while(!upQueue.isEmpty() || !downQueue.isEmpty()){
            if(!upQueue.isEmpty()){
                elevatorCar.move(upQueue.poll());
            }else if(!downQueue.isEmpty()){
                elevatorCar.move(downQueue.poll());
            }
        }
    }

}

