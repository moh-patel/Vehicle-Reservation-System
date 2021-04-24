import java.util.* ;
/**
 * This class stores information regarding a vehicle 
 * this is a super class 
 * It is not an abstract class since you may want to create a type of vehicle for which a class has not been made yet
 * @author (Mohammad Patel)
 */
public class Vehicle
{
    // determines the cost of hiring the vehicle and will depend on the make and mode
    protected String group;
    // vehicle id used by the hire company to identify the vehicle
    protected String vehID;
    // registration number of the vehicle
    protected String regNo; 
    // manufacturer of the vehicle
    protected String make;
    // model of the car e.g. "Mondeo TDCi Zetec"
    protected String model;
    // boolean field set true if the vehicle has air conditioning or climate control
    protected boolean airCon;
    // the size of the engine in litres
    protected double engineSize;
    // fuel type of the vehicle is either Unleaded or Diesl
    protected String fuelType;
    // gear box of the vehicle
    protected String gearbox;
    // the transmission of the vehicle, e.g. "RWD" for rear wheel drive vehicles
    protected String transmission;
    // the mileage of the car in miles
    protected int mileage;
    // the date the car was first registered in the format "XX-XX-XXXX"
    protected String dateFirstRegistered;
    
    
    /**
     * Create a new vehicle with default values for all its fields
     */
    public Vehicle()
    {
        // needs attention
        this.group = null;
        this.vehID = null;
        this.regNo = null;
        this.make = null;
        this.model = null;
        this.airCon = false;
        this.engineSize = 0.0;
        this.fuelType = null;
        this.gearbox = null;
        this.transmission = null;
        this.mileage = 0;
        this.dateFirstRegistered = null;
       
        
    }

    /**
     * Return the group of the vehicle as a String 
     */
    private String getGroup()
    {
        return group;
    }
    
    /**
     * Return the vehID of the vehicle as a String
     */
    public String getVehID()
    {
        return vehID;
    }
    
    /**
     * Return the regNo of the vehicle
     */
    public String getRegNo()
    {
        return regNo;
    }
    
    /**
     * Return the make of the vehicle
     */
    public String getMake()
    {
        return make;
    }
    
    // get method for model
    public String getModel()
    {
        return model;
    }
    
    //get method for engine size
    public double getEngineSize()
    {
        return engineSize;
    }
    
    //get method for fuel type
    public String getGearBox()
    {
        return fuelType;
    }
    
    //get method for gearbox
    public String getGearbox()
    {
        return gearbox;
    }
    
    //get method for transmission 
    public String getTransmission()
    {
        return transmission;
    }
    
    //get method for mileage
    public int getMileage()
    {
        return mileage;
    }
    
    //get method for dateFirstRegistered
    public String getDateFirstRegistered()
    {
        return dateFirstRegistered;
    }
    
    /**
     * Returns airCon as a String
     */
    private String getAirCon()
    {
        if (airCon = true)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
    
    
    /**
     * Output the details of the vehicle to the terminal window
     */
    public void printDetails()
    {
        System.out.println("******************************************************************");
        System.out.println( make + " " + model + " Group: " + group + " Vehicle ID: " + vehID);
        System.out.println("Air conditioning/Climate Control: " + getAirCon() );
        System.out.println("Engine Size: " + engineSize + " Fuel: " + fuelType );
        System.out.println("Gearbox: " + gearbox +  " Transmission: " + transmission );
        System.out.println("Mileage " + mileage + " Date first registered: " + dateFirstRegistered);
        System.out.println("Reg No: " + regNo);
    }
    
    /**
     * Read data by passing a scanner object as a parameter and assigns a value to its fields
     */
    public void readData(Scanner scanner)
    {
        group = scanner.next();
        vehID = scanner.next();
        regNo = scanner.next();
        make = scanner.next();
        model = scanner.next();
        if(scanner.next().toLowerCase().equals("yes"))
        {
            airCon = true;
        }
        else
        {
            airCon = false;
        }
        engineSize = scanner.nextDouble();
        fuelType = scanner.next();
        gearbox = scanner.next();
        transmission = scanner.next();
        mileage = scanner.nextInt();
        dateFirstRegistered = scanner.next(); 
    }
    
    
}
