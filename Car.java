/*
Programmer: Nicholas Sanchez
Filename: Car.java
Purpose: To create a car being stored in a Bashemin Parking Garage that knows
its license Number and the times its been moved out of the garage
*/
package BasheminParking;

/**
 * A class that simulates a car being parked in a Bashemin Garage
 * 
 */
public class Car {
    
    private String licenseNum; //the license number of the car
    private int timesMoved; //the number of times its been moved out of garage
    
    /**
     * a constructor that creates a car object
     * @param licenseNum the license number of the car
     */
    public Car(String licenseNum)
    {
        this.licenseNum = licenseNum ; 
        timesMoved = 0 ; 
    }
    
    /**
     * a method that increase the amount of times the car has been moved by 1
     */
    public void moveCar()
    {
        timesMoved++;
    }
    
    /**
     * a class that returns the license number of the car
     * @return the license number of the car
     */
    public String getLicenseNum()
    {
        return licenseNum ;
    }
    
    /**
     * a method that returns the amount of times a car has been moved
     * @return amount of times the car has been moved
     */
    public int getTimesMoved()
    {
        return timesMoved;
    }
    
}
