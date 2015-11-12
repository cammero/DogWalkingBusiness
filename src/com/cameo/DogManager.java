package com.cameo;
import java.util.ArrayList;

public class DogManager {

    public static void main(String[] args) {

    //created an array to store the names of the days of the week
    String daysOfWeekArray[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    //create an array to store each Dog object
    ArrayList<Dog> dogsToWalk = new ArrayList<>();

    //three dog objects
    Dog balto = new Dog ("Balto", "1234 Main Street");
    balto.createDogWalkingSchedule();
    dogsToWalk.add(balto);

    Dog cece = new Dog ("CeCe", "444 1st Ave");
    cece.createDogWalkingSchedule();
    dogsToWalk.add(cece);

    Dog duke = new Dog ("Duke", "734 7th Ave");
    duke.createDogWalkingSchedule();
    dogsToWalk.add(duke);

    int totalWalksPerDay = 0;   //initialize counter of the number of walks per day to zero
    for (int i = 0; i < daysOfWeekArray.length; i++){     //for each day of the week, print the day as a heading
        System.out.println("\n" + daysOfWeekArray[i] + ": ");
        //get the schedule of each dog that needs to be walked on that day.
        for (Dog eachDog : dogsToWalk) {
            eachDog.printDailySchedule(i);
            totalWalksPerDay += eachDog.walkingSchedule[i]; //add each dogs daily walk amount to total
            }
        //warning message will print if the schedule shows more than 6 walks in a day, since that is difficult to accomplish
        if (totalWalksPerDay > 6){
            System.out.println("Warning! You're trying to go on more than 6 walks today. You may need to hire an additional person.");
            //reset number of walks per day to zero
            totalWalksPerDay = 0;
            }
        }
    }
}
