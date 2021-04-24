import java.util.*;
/**
 * class Car stores information about a car
 * subclass of the Vehicle class
 * @author (Mohammad Patel)
 */
public class Car extends Vehicle
{
    // body type of the car
    private String bodyType;
    // number of doors the car has
    private int noOfDoors;
    // number of seats the car has
    private int noOfSeats;
    
    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        super();
        bodyType = null; noOfDoors = 0; noOfSeats = 0; 
    }
    
    //list of get methods
    public String getBodyType()
    {
        return bodyType;
    }
    
    public int getNoOfDoors()
    {
        return noOfDoors;
    }
    
    public int getNoOfSeats()
    {
        return noOfSeats;
    }
   
    
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Body Type: " + bodyType + " Number of doors " + noOfDoors);
        System.out.println("Number of seats: " + noOfSeats);
    }
    
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        bodyType = scanner.next();
        noOfDoors = scanner.nextInt();
        noOfSeats = scanner.nextInt();
    }
}
