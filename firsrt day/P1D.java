public class P1D
  {
  public static void main (String args[])
    {
    for(int ctr=1; ctr<11; ctr++)
      {
      int ctrSquared = ctr * ctr;
      int num = (int) ((ctrSquared + 1 - ctr) * Math.random () +ctr);
      System.out.println(ctr + "\t" + ctrSquared + "\t" + num);
      }
    }
  }