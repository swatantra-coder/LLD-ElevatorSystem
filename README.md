# LLD-ElevatorSystem
# Elevator System

## Overview
This project is an implementation of an elevator control system in Java. It includes classes to handle internal and external requests for elevator movement, as well as a dispatcher to manage multiple elevators.

## Project Structure
- `src/InternalDispatcher.java`: Handles internal requests within the elevator.
- `src/ElevatorController.java`: Manages the state and movement of an individual elevator.
- `src/ExternalDispatcher.java`: Handles external requests and assigns them to the appropriate elevator.
- `src/ElevatoreCreator.java`: Initializes and creates instances of elevators and their controllers.

## Classes

### InternalDispatcher
Handles internal requests within the elevator.

### ElevatorController
Manages the state and movement of an individual elevator.
- **Attributes**:
  - `PriorityQueue<Integer> upQueue`: Queue for upward requests.
  - `PriorityQueue<Integer> downQueue`: Queue for downward requests.
  - `ElevatorCar elevatorCar`: The elevator car being controlled.
- **Methods**:
  - `submitExternalRequest(int floor, Direction direction)`: Submits an external request.
  - `submitInternalRequest(int floor)`: Submits an internal request.
  - `operateElevator()`: Operates the elevator based on the requests.

### ExternalDispatcher
Handles external requests and assigns them to the appropriate elevator.
- **Attributes**:
  - `List<ElevatorController> elevatorControllersList`: List of elevator controllers.
- **Methods**:
  - `submitExternalRequest(int floor, Direction direction)`: Submits an external request to the appropriate elevator.

### ElevatoreCreator
Initializes and creates instances of elevators and their controllers.
- **Attributes**:
  - `static List<ElevatorController> elevatorControllerList`: List of elevator controllers.

## Usage
To use this project, compile and run the Java files in the `src` directory. The `ElevatoreCreator` class will initialize the elevators, and you can submit requests through the `ExternalDispatcher` and `ElevatorController` classes.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.
![image](https://github.com/user-attachments/assets/e9c5f379-bc86-4555-ac57-dbf2e37230c5)
