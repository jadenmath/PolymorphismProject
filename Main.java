//*****************************************************************
//  Main.java (Polymorphism Project)    Created by: Jaden Mathew
//
//  Main.java creates two Tank and two Gunship objects and adds them to an ArrayList of type Vehicle. It then iterates through the ArrayList, calling the move(), fire(), and reload() methods of each object in the list. If the object is a Gunship, it also calls the takeoff() and land() methods. Finally, it prints out the output of each method.
//*****************************************************************
// import the ArrayList library
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    // create an ArrayList of type Vehicle

    // Add tanks
    Tank tank1 = new Tank("M1 Abrams", 45.0, "USA", 9, 69, 62);
    // create a new Tank object with parameters
    Tank tank2 = new Tank("Leopard 2A6", 45.0, "Germany", 8, 60, 55);
    // create a second Tank object with parameters
    Tank tank3 = new Tank("Carter", 39.0, "Rochester", 4, 82, 63);
    // create a third Tank object with parameters
    Tank tank4 = new Tank("Mustang", 32.0, "India", 2, 20, 95);
    // create a fourth Tank object with parameters
    Tank tank5 = new Tank("Maple", 48.0, "Canada", 8, 69, 71);
    // create a fifth Tank object with parameters
    vehicles.add(tank1);
    // add the first Tank object to the vehicles ArrayList
    vehicles.add(tank2);
    // add the second Tank object to the vehicles ArrayList
    vehicles.add(tank3);
    // add the third Tank object to the vehicles ArrayList
    vehicles.add(tank4);
    // add the fourth Tank object to the vehicles ArrayList
    vehicles.add(tank5);
    // add the fifth Tank object to the vehicles ArrayList

    // Add gunships
    Gunship gunship1 = new Gunship("Apache", 171.0, 11, 320, 250);
    // create a new Gunship object with parameters
    Gunship gunship2 = new Gunship("Black Hawk", 186.0, 25, 480, 500);
    // create a second Gunship object with parameters
    Gunship gunship3 = new Gunship("Apache", 150.0, 19, 300, 200);
    // create a third Gunship object with parameters
    Gunship gunship4 = new Gunship("Black Hawk", 180.0, 8, 400, 200);
    // create a fourth Gunship object with parameters
    Gunship gunship5 = new Gunship("Apache", 152.0, 6, 500, 190);
    // create a fifth Gunship object with parameters
    vehicles.add(gunship1);
    // add the first Gunship object to the vehicles ArrayList
    vehicles.add(gunship2);
    // add the second Gunship object to the vehicles ArrayList
    vehicles.add(gunship3);
    // add the third Gunship object to the vehicles ArrayList
    vehicles.add(gunship4);
    // add the fourth Gunship object to the vehicles ArrayList
    vehicles.add(gunship5);
    // add the fifth Gunship object to the vehicles ArrayList

    // Print output
    for (Vehicle vehicle : vehicles) {
      vehicle.move();
      // call the move method on each vehicle in the vehicles ArrayList
      vehicle.fire();
      // call the fire method on each vehicle in the vehicles ArrayList
      vehicle.reload();
      // call the reload method on each vehicle in the vehicles ArrayList
      if (vehicle instanceof Gunship) {
        Gunship gunship = (Gunship) vehicle;
        // check if any vehicle in the ArrayList is a Gunship
        gunship.takeoff();
        // call the takeoff method on the Gunship object
        gunship.land();
        // call the land method on the Gunship object
      }
    }
  }
}