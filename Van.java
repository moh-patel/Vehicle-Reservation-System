import java.util.*;
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends Commercial
{
    // load compartment volume (m3)
    private double loadVolume;
    // Sliding Side Door 
    private boolean slidingSideDoor;
    
    /**
     * Constructor for objects of class Van
     */
    public Van()
    {
        super();
        loadVolume = 0;
        slidingSideDoor = false;
    }

    private String getSlidingSideDoor()
    {
        if (slidingSideDoor = true)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Load Compartment Volume (m3): " + loadVolume);
        System.out.println("Sliding Side Door: " + getSlidingSideDoor());
    }
    
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        loadVolume = scanner.nextDouble();
        if(scanner.next().toLowerCase().equals("yes"))
        {
            slidingSideDoor = true;
        }
        else
        {
            slidingSideDoor = false;
        }
    }
}
