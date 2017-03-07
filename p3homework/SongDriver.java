public class SongDriver
  {
   public static void main (String args[])
     {
      SongDriver GoodSong = new SongDriver ();
      SongDriver GreatSong = new SongDriver (1988 , "Where is my mind", 3.52);
      
      System.out.println (GoodSong);
      System.out.println ();
      System.out.println (GreatSong);
     }
  }