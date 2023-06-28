//*****************************************************************
//  Tank.java (Polymorphism Project)    Created by: Jaden Mathew
//
//  Tank.java defines a Tank class that extends the Vehicle class. The Tank class has attributes of countryOfOrigin, armorRating, ammoCapacity, and tonnage. It also contains methods to get and set these attributes, as well as methods for moving, firing, and reloading. It also has an equals() and toString() method for comparing and printing Tank objects.
//*****************************************************************
// create a class called Tank that extends the Vehicle class
public class Tank extends Vehicle {

  // declare variables for countryOfOrigin, armorRating, ammoCapacity and tonnage
  private String countryOfOrigin;
  private int armorRating;
  private int ammoCapacity;
  private int tonnage;

  // create a constructor for Tank with parameters
  public Tank(String name, double MPG, String countryOfOrigin, int armorRating, int ammoCapacity, int tonnage) {
    super(name, MPG);
    this.countryOfOrigin = countryOfOrigin;
    this.armorRating = armorRating;
    this.ammoCapacity = ammoCapacity;
    this.tonnage = tonnage;
  }

  // create a method to get the country of origin
  public String getCountryOfOrigin() {
    return this.countryOfOrigin;
  }

  // create a method to get the armor rating
  public int getArmorRating() {
    return this.armorRating;
  }

  // create a method to get the ammo capacity
  public int getAmmoCapacity() {
    return this.ammoCapacity;
  }

  // create a method to get the tonnage
  public int getTonnage() {
    return this.tonnage;
  }

  // create a method to set the country of origin
  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  // create a method to set the armor rating
  public void setArmorRating(int armorRating) {
    this.armorRating = armorRating;
  }

  // create a method to set the ammo capacity
  public void setAmmoCapacity(int ammoCapacity) {
    this.ammoCapacity = ammoCapacity;
  }

  // create a method to set the tonnage
  public void setTonnage(int tonnage) {
    this.tonnage = tonnage;
  }

  // create an equals method to compare two objects
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }

    Tank other = (Tank) obj;
    return super.equals(other) && this.countryOfOrigin.equals(other.countryOfOrigin)
        && this.armorRating == other.armorRating
        && this.ammoCapacity == other.ammoCapacity && this.tonnage == other.tonnage;
  }

  // create a toString method to get the Tank's attributes
  public String toString() {
    return super.toString() + ", Country of Origin: " + this.countryOfOrigin + ", Armor Rating: " + this.armorRating
        + ", Ammo Capacity: " + this.ammoCapacity + ", Tonnage: " + this.tonnage;
  }

  // create a move method to print the Tank's name and speed
  public void move() {
    System.out.println("The " + this.getName() + " is moving at a speed of " + this.getMPG() + " mph.");
  }

  // create a fire method to print the Tank's name
  public void fire() {
    System.out.println("The " + this.getName() + " is firing its gun!");
  }

  // create a reload method to print the Tank's name
  public void reload() {
    System.out.println("The " + this.getName() + " is reloading its ammo!");
  }
}