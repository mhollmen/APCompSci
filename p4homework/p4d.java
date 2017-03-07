import java.util.ArrayList;
public class p4d
  {
   public static void main (String args[])
     {
      ArrayList<String> family = new ArrayList<String>();
      family.add ("Olli");
      family.add ("Kaija");
      family.add ("Milla");
      family.add ("Martta");
      System.out.println ("Number of people: " + family.size());
      System.out.println ("Names: ");
      for (int i = 0; i<family.size(); i++)
        {
         System.out.println (family.get (i));
        }
      System.out.println ("\n" + "Let's go for round 2");
      for (String member : family)
        {
         System.out.println (member);
        }
     }
  }