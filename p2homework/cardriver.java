public class cardriver
  {
  public static void main (String args [])
    {
    car ricerocket = new car ();
    car othercar = new car (6, 1967, "Toyota", "2000GT", false, true);
    System.out.println(ricerocket + "\n" + othercar);
    }
  }
  
  
  
  
  
  /*
   * 
   * public class car
  {
  private int numofcylinders;
  private int year;
  private String make;
  private String model;
  private boolean turbo;
  private boolean streetlegal;
  public car ()
    {
    numofcylinders = 8;
    year = 1972;
    make = new String ("Honda");
    model = new String ("Civic Hatchback");
    turbo = true;
    streetlegal = false;
    }
  public car (int numofcylinders, int year, String make, String model, boolean turbo, boolean streetlegal)
    {
    this.numofcylinders = numofcylinders;
    this.year = year;
    this.make = make;
    this.model = model;
    this.turbo = turbo;
    this.streetlegal = streetlegal;
    }
  public String toString()
    {
    String output = new String ();
    output = "\n" + "Number of cylinders: " + numofcylinders + "\n"+ 
             "Year: " + year + "\n"+ 
             "Make: " + make + "\n"+
             "Model: " + model + "\n" +
             "Turbo: " + turbo + "\n" +
             "Street legal: " + streetlegal + "\n";
    return output;
    }
  }
   */