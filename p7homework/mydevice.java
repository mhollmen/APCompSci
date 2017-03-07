public class mydevice
  {
   private int memory;
   private String color;
   public mydevice ()
     {
      memory = 64;
      color = new String ("Blue");
     }
   public mydevice (int memory, String color)
     {
      this.memory = memory;
      this.color = color;
     }
   public String toString()
     {
      String output = new String ();
      output = "\n" + "Gigs of memory: " + memory +
               "Color: " + color;
      return output;
     }
  }