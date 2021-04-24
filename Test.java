import java.util.*;
import java.io.File;
/**
 * A test class for the project
 *
 * @author (Mohammad Patel)
 */
public class Test
{
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
       /*
        * create object/s from the ReservationSystem class
        */
       ReservationSystem reservationSystem = new ReservationSystem("test1");
       //ReservationSystem reservationSystem2 = new ReservationSystem("test2");
       
       /* 
        * check printAllVehicles() and printAllCustomers prints an appropiate message
        * when no customers or vehicles are stored in the reservationSystem
        */
            // reservationSystem.printAllVehicles();
            // reservationSystem.printAllVehicles();
       
       /*
        * call readVehicleData() and file dialog box should appear
        * call printAllVehicles() to see whether all the data has been read properly, 
        * if there aren't any vehicles stored then prints an appropiate message
        */
            //reservationSystem.readVehicleData();
            //reservationSystem.printAllVehicles();
       
       /*call readCustomer() and a file dialog box should appear
        * call printAllVehicles() to see whether all the data has been read and stored properly 
        * if there aren't any vehicles stored then prints an appropiate message
        */
            //reservationSystem.readCustomerData();
            //reservationSystem.printAllCustomers();
       
       //test the customer data has been written appropiately and prints all the data written to the file is correct
           // reservationSystem.readCustomerData();
           // reservationSystem.writeCustomerData("customer");
           // ReservationSystem reservationSystem2 = new ReservationSystem("test2");
           // reservationSystem2.readCustomerData("customer");
           // reservationSystem2.printAllCustomers();
       
       // test that a customer object is assigned a customer ID when stored in the reservation System
            // Customer customer = new Customer("patel", "mo" , "Mr", "Student");
            // reservationSystem.storeCustomer(customer);
            // customer.printDetails();
            
       // test generateCustomerID(), make the method temporarily public to test
           // System.out.println(reservationSystem.generateCustomerID("AB-", 6));
           // System.out.println(reservationSystem.generateCustomerID("AB-", 5));
           // System.out.println(reservationSystem.generateCustomerID("AB-", 4));
           // System.out.println(reservationSystem.generateCustomerID("AB-", 3));
           // System.out.println(reservationSystem.generateCustomerID("AB-", 2));
           // System.out.println(reservationSystem.generateCustomerID("AB-", 1));
           // System.out.println(reservationSystem.generateCustomerID("AB-", 6));
       
       // test that a customer object is assigned a customer ID when stored in the reservation System
            // Customer customer = new Customer("patel", "mo" , "Mr", "Student");
            // reservationSystem.storeCustomer(customer);
            // customer.printDetails();
          
       /*
        * check whether storeCustomer() method gives a customer an ID
        * call the printAllCustomers() method and all customers should have an ID
        */    
            // reservationSystem.readCustomerData("customer_data.txt");
            // reservationSystem.printAllCustomers();
            
       /*
        *  checks whether the daysBetween() is operating correctly, it should print 7 for the 2 dates
        * date1 = 23-03-2019
        * date2 = 30-03-2019
        */
            // DateUtil dateUtil = new DateUtil();
            // Date date1 = dateUtil.convertStringToDate("23-03-2019");
            // Date date2 = dateUtil.convertStringToDate("30-03-2019");
            // System.out.println(dateUtil.daysBetween(date1, date2));
            
       // test the Vehicle Reservation class 
            // VehicleReservation vehicleReservation = new VehicleReservation("000001","TF-63403", "AB-327280","23-03-2019", 7);
            // vehicleReservation.printDetails();
       
       // test generateReservationNumber(), should print 000001, 000002, 000003, 000004 and the last reservation number should be 4
            // System.out.println(reservationSystem.generateReservationNumber());
            // System.out.println(reservationSystem.generateReservationNumber());
            // System.out.println(reservationSystem.generateReservationNumber());
            // System.out.println(reservationSystem.generateReservationNumber());
            // System.out.println("The last reservation number is " + reservationSystem.getLastReservationNumber()); 
            
       //test for storeVehicleReservation() whether it adds the reservation to the diary 
            // reservationSystem.storeVehicleReservation(vehicleReservation);
            // reservationSystem.printAllVehicleReservations();
            // reservationSystem.printDiaryEntries("20-03-2019", "29-03-2019");
            
       // test for makeVehicleReservation(), if method is unsuccessful a VehicleReservation is not created
          //input invalid customer ID prints an appropiate message and vehicle is not resserved
            // reservationSystem.makeVehicleReservation("AB-327280", "TF-63403", "23-03-2019", 7);
            // reservationSystem.printAllVehicleReservations();
          // input invalid vehicle ID prints an appropiate messag
            // Customer customer = new Customer("patel", "mo" , "Mr", "Student");
            // reservationSystem.storeCustomer(customer);
            // String customerID = customer.getCustomerID();
            // reservationSystem.makeVehicleReservation(customerID, "TF-XXXXX", "23-03-2019", 7);
            // reservationSystem.printAllVehicleReservations();
          // input invalid date format
            // reservationSystem.makeVehicleReservation(customerID, "TF-63403", "23rd March 2019", 7);
            // reservationSystem.printAllVehicleReservations();
          // input invalid number of days for reservation
            // reservationSystem.makeVehicleReservation(customerID, "TF-63403", "23-03-2019", -1);
            // reservationSystem.printAllVehicleReservations();
          // input valid reservation details
             // reservationSystem.makeVehicleReservationNumber(customerID, "TF-63403", "23-03-2019", 7);
             // reservationSystem.printAllVehicleReservations();
           // try making a reservation for a vehicle which has already been reserved for all or part of the reservation period 
              // Customer customer2 = new Customer("Hick", "John", "Mr", "Dr");
              // reservationSystem.storeCustomer(customer2);
              // String customerID2 = customer2.getCustomerID();
              // reservationSystem.makeVehicleReservation(customerID2, "TF-63403", "24-03-2019", 1);
              // reservationSystem.printAllVehicleReservations();
           // make a reservation for a vehicle which has not been reserved for the specified reservation period
              // reservationSystem.makeVehicleReservation(customerID2, "TF-63403", "20-03-2019", 1);
              // reservationSystem.printAllVehicleReservations();  
              
          //test for writeVehicleReservationData and readVehicleReservationData
                // reservationSystem.writeVehicleReservationData("test_vehicle_reservation_data.txt");
                // reservationSystem2.readVehicleReservationData("test_vehicle_reservation_data.txt");
                // reservationSystem2.printAllVehicleReservations();
           
          // test deleteReservation() 
                // reservationSystem.deleteVehicleReservation("000001");
                // reservationSystem.printAllVehicleReservations();
          
          // test for closeDownSystem() and reloadSystem(), to check whether data is stored to its orignal state
                reservationSystem.closeDownSystem();
                // ReservationSystem resrvationSystem3 = new ReservationSystem("test1");
                // reservationSystem.printAllVehicleReservations();
          
    }

    
}
