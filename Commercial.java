import java.util.*;
/**
 * This is a Commercial class, which is a subclass of the Vehicle class
 * and a super class of the Truck and Van class
 * It stores the information of the weight of the maximum load permitted in kg
 * @author (Mohammad Patel)
 */
public abstract class Commercial extends Vehicle
{
    // weight of the maximum load permitted in kg.(stored as an int)
    private int payload;

    /**
     * Constructor for objects of class Commercial
     */
    public Commercial()
    {
        super();
        payload = 0;
    }
    
    public int getPayload()
    {
        return payload;
    }
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Payload: " + payload + " kg" );
    }
    
    //assign value to a variable by passing a scanner object
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        payload = scanner.nextInt();
        
    }
}
