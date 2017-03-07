public class P1H
  {
  public static void main (String args[])
    {
    String [] music = {"Neil Young ","Beatles ","Sleepy Sleepers"};
    String michael = "Michael Jackson";
    for (int ctr=0; ctr<music.length;ctr++)
      {
      System.out.println(music[ctr]);
      }
      System.out.println("\n");
      int random = (int) (music.length * Math.random());
      music [random]= michael;
    for( int ctr = 0; ctr < music.length; ctr++ )
      {
       System.out.println(music[ctr]);
      }
    System.out.println("\n");
    System.out.println("We found Michael");
    System.out.println("\n");
    /*for( int ctr = 0; ctr < music.length; ctr++ )
      {
      System.out.println("No Michael in music ");
      System.out.println(music[ctr].equals(michael) + "Michael!!!");
      }*/
    for( int ctr = 0; ctr < music.length; ctr++ )
      {
      if (music[ctr].equals(michael))
        {
        System.out.println("Michael!!!");
        }
      else
        {
        System.out.println("No Michael in music ");
        }
      }
    }
  }