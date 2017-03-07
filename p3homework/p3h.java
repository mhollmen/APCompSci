import javax.swing.JOptionPane;
public class p3h
  {
  public static void main (String args[])
    {
     String [] teachers = new String [6];
     for (int index = 0; index < teachers.length; index++ )
       {
       teachers[index] = new String("Wrightson");
       teachers[index + 1] = new String("Peterson");
       teachers[index + 2] = new String("Whitten");
       teachers[index + 3] = new String("Brown");
       teachers[index + 4] = new String("Scott");
       teachers[index + 5] = new String("Anderson");
       break;
       }
     for(String person : teachers)
        {
        System.out.println(person);
        }
    }
  }