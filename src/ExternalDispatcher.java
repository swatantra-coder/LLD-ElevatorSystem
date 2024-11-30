import java.util.List;

public class ExternalDispatcher {
    List<ElevatorController> elevatorControllersList=ElevatoreCreator.elevatoreControllersList;
    public void submitExternalRequest(int floor, Direction direction){

        //for simplicity odd even
        //explain
        /*
        * 1. If the floor is odd, then the elevator with odd id will be called.
        * 2. If the floor is even, then the elevator with even id will be called.
        * 3. If the floor is even and the elevator id is odd, then the elevator with odd id will be called.
         */
        for(ElevatorController elevatorController:elevatorControllersList){
            int elevatorId=elevatorController.elevatorCar.id;
            if(elevatorId%2==floor%2){
                elevatorController.submitExternalRequest(floor,direction);
            }
            else if(elevatorId%2==0 && floor%2==0){
                elevatorController.submitExternalRequest(floor,direction);
            }
        }
    }
}
