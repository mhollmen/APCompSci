public class P1E
  {
  public static void main (String args[])
    {
    String [] movies = {"Mad Max", "The Wolf of Wallstreet", "Wall-E"};
    String [] songs = {"Livin on a Prayer", "Old Man", "More Than a Feeling"};
    for (int index = 0; index < movies.length; index++)
      {
      System.out.println(movies[index]);
      }
    System.out.println("  ");
    System.out.println("  ");
    int index=0;
    while (index < songs.length)
      {
      System.out.print(songs[index] + ", ");
      index = index +1;
      }
    }
  }