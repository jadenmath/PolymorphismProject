//*****************************************************************
//  Vehicle.java (Polymorphism Project)    Created by: Jaden Mathew
//
//  Vehicle.java defines an abstract Vehicle class. It contains two attributes of name and MPG, as well as methods to get and set these attributes. It also has an equals() and toString() method for comparing and printing Vehicle objects. Additionally, it contains abstract methods for moving, firing, and reloading.
//*****************************************************************
// create an abstract class called Vehicle
public abstract class Vehicle {

  // declare variables for name and MPG
  private String name;
  private double MPG;

  // create a constructor for Vehicle with parameters
  public Vehicle(String name, double MPG) {
    this.name = name;
    this.MPG = MPG;
  }

  // create a method to get the name
  public String getName() {
    return this.name;
  }

  // create a method to get the MPG
  public double getMPG() {
    return this.MPG;
  }

  // create a method to set the name
  public void setName(String name) {
    this.name = name;
  }

  // create a method to set the MPG
  public void setMPG(double MPG) {
    this.MPG = MPG;
  }

  // create an equals method to compare two objects
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }

    Vehicle other = (Vehicle) obj;
    return this.name.equals(other.name) && this.MPG == other.MPG;
  }

  // create a toString method to get the Vehicle's attributes
  public String toString() {
    return "Name: " + this.name + ", MPG: " + this.MPG;
  }

  // create an abstract move method
  public abstract void move();

  // create an abstract fire method
  public abstract void fire();

  // create an abstract reload method
  public abstract void reload();
}