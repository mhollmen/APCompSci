public class P1G
  {
  public static void main (String args[])
    {
    int[] numarray = new int[10];
    int start = -100;
    int end = 100;
    int ctr = 0;
    for( int index = 0; index < numarray.length; index++ )
      {
      numarray [index] = start + (int) (Math.random() * ( (end - start) + 1) );
      }
    for( int index = 0; index < numarray.length; index++ )
      {
      System.out.println (numarray [index]);
      if (numarray [index] > 0)
        {
        ctr++;
        }
      }
      System.out.println (" ");
      System.out.println ("There are " + ctr + " positives.");
    }
  }
