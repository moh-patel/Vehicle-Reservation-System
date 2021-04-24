import java.util.*;
import java.io.*;
/**
 * The class VehicleReservation stores information about
 * a customer who has hired a specific vehicle
 * and keeps a record of the duration of the reservation
 * 
 * @author (Mohammad Patel)
 */
public class VehicleReservation
{
    private String reservationNo;
    private String vehID;
    private String customerID;
    //the date of the first date of the reservation
    private Date startDate;
    // the duration of the reservation
    private int noOfDays;
    
    /*
     * Constructor for objects of class VehicleReservation
     * pass 5 Parameters to initialise the 5 Fields
     */
    public VehicleReservation(String reservationNo, String vehID, String customerID, String startDate, int noOfDays)
    {
        this.reservationNo = reservationNo;
        this.vehID = vehID;
        this.customerID = customerID;
        this.startDate = DateUtil.convertStringToDate(startDate);
        this.noOfDays = noOfDays;
    }
    
    /*
     * Default Constructor 
     */
    public VehicleReservation()
    {
        reservationNo = null ;
        vehID = null;
        customerID = null;
        startDate = null;
        noOfDays = 0;
    }
    
    //list of get methods
    public String getReservationNo()
    {
        return reservationNo;
    }
    
    public Date getStartDate()
    {
        return startDate;
    }
    
    public int getNoOfDays()
    {
        return noOfDays;
    }
    
    public String getVehID()
    {
        return vehID;
    }
    
    //prints details of the vehicles
    public void printDetails()
    {
        System.out.println("Reservation Number: " + reservationNo);
        System.out.println("Vehicle ID: " + vehID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Start Date: " + DateUtil.convertDateToLongString(startDate));
        System.out.println("Number Of Days: " + noOfDays);
    }
    
    //Pass a Scanner object to read data and assign values to the fields
    public void readData(Scanner scanner)
    {
        reservationNo = scanner.next();
        vehID = scanner.next();
        customerID = scanner.next();
        startDate = DateUtil.convertStringToDate(scanner.next());
        noOfDays = scanner.nextInt();
    }
    
    //pass a PrintWriter object to write this vehicle reservation to a file
    public void writeData(PrintWriter pWriter)
    {
        String lineOfOutput= reservationNo + ", " + vehID + ", " + customerID + ", " 
                            + DateUtil.convertDateToShortString(startDate) + ", " 
                            + noOfDays;
        pWriter.println(lineOfOutput);
    }
    
    public String toString()
    {
        return reservationNo + ", " + customerID + ", " + vehID;
    }
}
