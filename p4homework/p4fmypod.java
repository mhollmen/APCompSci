import java.util.ArrayList;
public class p4fmypod
  {
  private String color;
  private int memorycapacity;
  private String [] songs = new String [3];
  public p4fmypod ()
    {
     color = new String ("Blue");
     memorycapacity = 32;
     ArrayList<String> song = new ArrayList<String>();
     song.add ("Little black submarines");
     song.add ("Fever");
     song.add ("Unknown Brother");
     System.out.println ("Number of songs: " + song.size());
     System.out.println ("Names: ");
    }
  public p4fmypod (String color, int memorycapacity, String length)
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