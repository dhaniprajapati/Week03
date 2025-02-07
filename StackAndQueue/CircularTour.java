package stackandqueue;

import java.util.*;

public class CircularTour {
    //static class to define petrol pump
    static class PetrolPump {
        //attributes
        int petrol;
        int distance;
        // constructor
        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
    // method to find the starting point of the tour
    public static int completeTour(PetrolPump[] pumps) {
        //initialize the pumps length as n
        int n = pumps.length;
        // create variable and initialize it to 0
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;
        //create queue to keep track of the tour
        Queue<Integer> queue = new LinkedList<>();
        // run loop to check each pump
        for (int i = 0; i < n; i++) {
            //create surplus to store the remaining petrol
            int surplus = pumps[i].petrol - pumps[i].distance;
            //add surplus to total surplus and current surplus
            totalSurplus += surplus;
            currentSurplus += surplus;
            // if surplus is negetive
            if (currentSurplus < 0) {
                //jump to next index value
                start = i + 1;
                //make current surplus 0 and clear the queue
                currentSurplus = 0;
                queue.clear();
            }
            //else add current pump to queue
            else {
                queue.add(i);
            }
        }
        //return starting point if total surplus is positive, otherwise return -1
        return totalSurplus >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        //create an array with the values of petrol and distance
        PetrolPump[] pumps = {
                new PetrolPump(9, 8),
                new PetrolPump(6, 8),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };
        //find the starting point of the circular tour and print it
        int startingPoint = completeTour(pumps);
        System.out.println("Starting point: " + startingPoint);
    }
}
