public class P2A
  {
  private int year;
  private String title;
  private double length;
  public P2A ()
    {
     year = 1976;
     title = new String ("Hotel California");
     length = 6.30;
    }
  public P2A (int year, String title, double length)
    {
    this.year = year;
    this.title = title;
    this.length = length;
    }
  public String toString()
    {
    String output = new String ();
    output = "The year is: " + year + "\n"+ 
             "The title is: " + title + "\n"+ 
             "The length is: " + length ;
    return output;
    }
  }