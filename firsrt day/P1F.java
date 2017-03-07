public class P1F
  {
  public static void main (String args[])
    {
    int[] numarray = new int[50];
    int start = 0;
    int end = 100;
    for( int index = 0; index < numarray.length; index++ )
      {
      numarray [index] = start + (int) (Math.random() * ( (end - start) + 1) );
      }
    for( int index = 0; index < numarray.length; index++ )
      {
      System.out.print (numarray [index] + " ");
      }
    }
  }