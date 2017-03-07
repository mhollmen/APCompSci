public class mypod
  {
  private String color;
  private int memorycapacity;
  private String [] songs = new String [3];
  public mypod ()
    {
     color = new String ("Blue");
     memorycapacity = 32;
     songs[0] = "Grandma Got Run Over by a Reindeer";
     songs[1] = "Amish Paradise";
     songs[2] = "We Built This City";
    }
  public mypod (String color, int memorycapacity, String length)
    {
    this.color = color;
    this.memorycapacity = memorycapacity;
    this.songs = new String [3];
    songs[0] = new String ("Grandma Got Run Over by a Reindeer");
    songs[1] = new String ("Amish Paradise");
    songs[2] = new String ("We Built This City");
    }
  public String toString()
    {
    String output = new String ();
    output = "The color is: " + color + "\n"+ 
             "The storage space is: " + memorycapacity + "GB" + "\n"+ 
             "The songs are: " + songs ;
    return output;
    }
  }