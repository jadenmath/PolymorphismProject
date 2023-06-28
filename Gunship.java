//*****************************************************************
//  Gunship.java (Polymorphism Project)    Created by: Jaden Mathew
//
//  Gunship.java defines a Gunship class that extends the Vehicle class. The Gunship class has attributes of rocketCapacity, topSpeed, and effectiveRange. It also contains methods to get and set these attributes, as well as methods for moving, firing, reloading, taking off, and landing. It also has an equals() and toString() method for comparing and printing Gunship objects.
//*****************************************************************
// Create a class Gunship which inherits from Vehicle class
public class Gunship extends Vehicle {

  // Declare instance variables
  private int rocketCapacity;
  private int topSpeed;
  private int effectiveRange;

  // Create a constructor for Gunship class
  public Gunship(String name, double MPG, int rocketCapacity, int topSpeed, int effectiveRange) {
    // Call the parent's constructor
    super(name, MPG);

    // Assign the value of rocketCapacity to the instance variable rocketCapacity
    this.rocketCapacity = rocketCapacity;

    // Assign the value of topSpeed to the instance variable topSpeed
    this.topSpeed = topSpeed;

    // Assign the value of effectiveRange to the instance variable effectiveRange
    this.effectiveRange = effectiveRange;
  }

  // Create a method to get the value of rocketCapacity
  public int getRocketCapacity() {

    // Return the value of rocketCapacity
    return this.rocketCapacity;
  }

  // Create a method to get the value of topSpeed
  public int getTopSpeed() {

    // Return the value of topSpeed
    return this.topSpeed;
  }

  // Create a method to get the value of effectiveRange
  public int getEffectiveRange() {

    // Return the value of effectiveRange
    return this.effectiveRange;
  }

  // Create a method to set the value of rocketCapacity
  public void setRocketCapacity(int rocketCapacity) {

    // Assign the value of rocketCapacity to the instance variable rocketCapacity
    this.rocketCapacity = rocketCapacity;
  }

  // Create a method to set the value of topSpeed
  public void setTopSpeed(int topSpeed) {

    // Assign the value of topSpeed to the instance variable topSpeed
    this.topSpeed = topSpeed;
  }

  // Create a method to set the value of effectiveRange
  public void setEffectiveRange(int effectiveRange) {

    // Assign the value of effectiveRange to the instance variable effectiveRange
    this.effectiveRange = effectiveRange;
  }

  // Create a method to check if two objects are equal
  public boolean equals(Object obj) {
    // Check if the object passed in is the same as the object that is calling the
    // method
    if (obj == this) {

      // Return true if it is the same
      return true;
    }

    // Check if the object passed in is null or if the class of the object passed in
    // is not the same as the class of the object that is calling the method
    if (obj == null || obj.getClass() != this.getClass()) {
      // Return false if it is null or not the same class
      return false;
    }

    // Cast the object passed in to type Gunship
    Gunship other = (Gunship) obj;

    // Return true if the parent object is equal and if the instance variables of
    // the object passed in and the object that is calling the method are equal
    return super.equals(other) && this.rocketCapacity == other.rocketCapacity && this.topSpeed == other.topSpeed
        && this.effectiveRange == other.effectiveRange;
  }

  // Create a method to return a string representation of the object
  public String toString() {

    // Return the string representation of the parent object plus the instance
    // variables of the object that is calling the method
    return super.toString() + ", Rocket Capacity: " + this.rocketCapacity + ", Top Speed: " + this.topSpeed
        + ", Effective Range: " + this.effectiveRange;
  }

  // Create a method to move the object
  public void move() {

    // Print a statement that the object is flying at a certain speed
    System.out.println("The " + this.getName() + " is flying at a speed of " + this.getMPG() + " mph.");
  }

  // Create a method to fire the object
  public void fire() {

    // Print a statement that the object is firing its rockets
    System.out.println("The " + this.getName() + " is firing its rockets!");
  }

  // Create a method to reload the object
  public void reload() {

    // Print a statement that the object is reloading its rockets
    System.out.println("The " + this.getName() + " is reloading its rockets!");
  }

  // Create a method to take off the object
  public void takeoff() {

    // Print a statement that the object is taking off
    System.out.println("The " + this.getName() + " is taking off!");
  }

  // Create a method to land the object
  public void land() {

    // Print a statement that the object is landing
    System.out.println("The " + this.getName() + " is landing!");
  }
}