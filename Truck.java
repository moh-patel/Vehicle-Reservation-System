import java.util.*;
/**
 * Truck class stores extra information about a truck
 * is subclass of the commercial class
 * @author (Mohammad Patel)
 */
public class Truck extends Commercial
{
    // additional attributes of the truck
    private ArrayList<String> attributes;
    /**
     * Constructor for objects of class Truck
     */
    public Truck()
    {
        super();
        attributes = new ArrayList<String>();
    }
    
    public ArrayList<String> getAttributes()
    {
        return attributes;
    }
    
    public void printDetails()
    {
        super.printDetails();
        System.out.print("Additional attributes: ");
        for( String attribute : attributes )
        {
            System.out.print(attribute + ", ");
        }
        System.out.println();
    }
    
    //Read data by passing a scanner object as a parameter and assigns the attributes to the truck
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        while(scanner.hasNext())
        {
            attributes.add(scanner.next());
        }
        scanner.close();
    }
}
