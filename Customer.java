import java.util.*;
import java.io.*;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    private String customerID;
    private String surname;
    private String firstName;
    private String otherInitials;
    private String title;
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String surname, String firstName, String otherInitials, String title)
    {
        customerID = "unknown";
        this.surname = surname;
        this.firstName = firstName;
        this.otherInitials = otherInitials;
        this.title = title;
    }
    
    //default constructor
    public Customer()
    {
        customerID = null;
        surname = null;
        firstName = null;
        otherInitials = null;
        title = null;
    }
    
    // list of get methods
    public String getCustomerID()
    {
        return customerID;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getOtherInitials()
    {
        return otherInitials;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    // set the customerID 
    public void addCustomerID(String customerID)
    {
        this.customerID = customerID;
    }
    
    //print details of a customers fields
    public void printDetails()
    {
        System.out.println("Customer ID: " + customerID + " Surname: " + surname + " First Name: " + firstName );
        System.out.println("Title: " + title + " Other Initials: " + otherInitials );
    }
    
    // read data to initialise values for the fields of the customer
    public void readData(Scanner scanner)
    {
        customerID = scanner.next();
        surname = scanner.next();
        firstName = scanner.next();
        otherInitials = scanner.next();
        title = scanner.next();
    }
    
    //write data to a file
    public void writeData(PrintWriter pWriter)
    {
        String lineOfOutput= customerID + ", " + surname + ", " + firstName + ", " + otherInitials + ", " + title;
        pWriter.println(lineOfOutput);
    }
}
