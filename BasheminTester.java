/*
Programmer: Nicholas Sanchez
Filename: BasheminTester
Purpose: To test the garage and car classes
*/
package BasheminParking;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * A class that reads an input file to test the garage and car classes
 * 
 */
public class BasheminTester {

    
    public static void main(String[] args) throws IOException {
        
        Garage myGarage = new Garage() ; // a new garage object
        
        // read the file garage.txt
        Scanner carInputs = new Scanner(new File("garage.txt")) ;//
        String licensePlate ; // license plater number of car
        String arriveOrDepart ; // wether the car is leaving or departing
        
        /*
        a while loop that reads through garage.txt until eof
        */
        while(carInputs.hasNext())
        {
            licensePlate = carInputs.next() ; //store license Plate Num
            arriveOrDepart = carInputs.next() ; // arriving or departing
            System.out.println(licensePlate + " " + arriveOrDepart);
            
            /*
            checks if the car is arriving or departing and then calls 
            appropriate methods
            */
            if(arriveOrDepart.equals("ARRIVE"))
            {
                System.out.println(myGarage.arrive(licensePlate));
            } else
            {
                System.out.println(myGarage.depart(licensePlate));
            }
        }
    }
    
}
