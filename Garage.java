/*
Programmer: Nicholas Sanchez
Filename: Garage.java
Purpose: To implement a Bashemin Parking Garage that stores an ArrayList of Cars
*/
package BasheminParking;

import java.util.ArrayList;

/**
 * a class that implements a Bashemin Parking Garage
 * 
 */
public class Garage {
    
    private static final int CAPACITY = 10 ;
    private ArrayList<Car> basheminGarage; // list of cars in garage
    
    /**
     * A constructor that creates a Bashemin Garage object
     */
    public Garage()
    {
        basheminGarage = new ArrayList<Car>() ;
    }
    /**
     * a method that adds a new car to the parking garage
     * @param arrival the license number of the car being added
     * @return that the new car was added
     */
    public String arrive(String arrival)
    {
        
        Car newCar = new Car(arrival) ;
        /*
        If garage is not full park the car else state the garage is full
        */
        if( basheminGarage.size() < CAPACITY)
        {    
            basheminGarage.add(newCar);
            return newCar.getLicenseNum() + " has been added to the garage.\n";
        } else
        {
            return "Sorry the garage is full!\n" ;
        }
        
    }
    
    /**
     * a method that takes a car out of the garage
     * @param departing the car that is departing
     * @return that the car departed
     */
    public String depart(String departing)
    {
       
        /*
        A loop that checks if the car is in the garage. 
        */
        for( int index = 0; index < basheminGarage.size(); index++)
        {
            Car current = basheminGarage.get(index) ;
            
            /*
            If the car is in the garage increment cars that will be moved and 
            and then remove the departing car, else the car could not be found
            */
            if(departing.equals(current.getLicenseNum()))
            {
                increment(index) ;
                basheminGarage.remove(index) ;
                return departing + " has departed the garage. It was moved " 
                                 + current.getTimesMoved() + " times.\n";
            } 
        }
        return "The car could not be found.\n" ;
    }
    
    /*
    A method that increments the amount of times a car has been moved out of the
    garage
    */
    private void increment(int departIndex)
    {
        
        /*
        a loop that increments all cars before the departing car
        */
        for(int index = 0 ; index < departIndex; index++)
        {
            Car current = basheminGarage.get(index );
            current.moveCar();
        }
    }
}
