package com.cameo;
import java.util.Scanner;
/**
 * Created by Cameo on 11/1/2015.
 */
public class Dog {

    private String dogName;
    private String ownerAddress;
    protected int[] walkingSchedule;

    //Constructor
    public Dog(String dogName, String address) {
        this.dogName = dogName;
        this.ownerAddress = address;
        this.walkingSchedule = new int[7];
    }

    public void createDogWalkingSchedule(){
        Scanner s = new Scanner(System.in);
        String daysOfWeekArray[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < daysOfWeekArray.length; i++) {
            System.out.println("How many times should " + this.dogName + " be walked on " + daysOfWeekArray[i] + "?");
            this.walkingSchedule[i] = s.nextInt();
        }
    }

    public void printDailySchedule(int dayOfWeek){
        System.out.println("Walk " + dogName + " " + walkingSchedule[dayOfWeek] + " times. Address: " + ownerAddress);
    }

    public String getDogName() {return dogName;}
    public void setDogName(String dogName) {this.dogName = dogName;}

    public String getOwnerAddress() {return ownerAddress;}
    public void setOwnerAddress(String ownerAddress) {this.ownerAddress = ownerAddress;}

    //did not create setter for walkingSchedule since walkingSchedule is created by createDogWalkingSchedule method
    public int[] getWalkingSchedule() {
        return walkingSchedule;
    }
}
