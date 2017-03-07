import javax.swing.JOptionPane;
public class P1I
  {
  public static void main (String args[])
    {
     String username = "max";
     String password = "password";
     String usernameinput = JOptionPane.showInputDialog("Username");
     String passwordinput = JOptionPane.showInputDialog("Password");
     if(usernameinput.equals(username)&& passwordinput.equals(password))
      {
      System.out.print ("You're in");
      }
      else 
        {
        System.out.print ("Try again");
        }
      //else System.out.print ("Try again");
    }
  }