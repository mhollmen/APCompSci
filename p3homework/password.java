import javax.swing.*;
public class password
  {
  public static void main (String [] args)
    {
    int attempts = 1;
    while (attempts == 1)
      {
      String username = JOptionPane.showInputDialog("Username");
      String password = JOptionPane.showInputDialog("Your password should contain at least 6 characters "
                                                     + "\n" + "and it should contain a special character "
                                                     + "\n" + "Create password: ");
      if(username.length() >=6 && username.matches ("^.*[^a-zA-Z0-9].*$"))
        {
         JOptionPane.showInputDialog(null, "Your password is valid!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
      if(username.length() >=6 || username != ("^.*[^a-zA-Z0-9].*$"))
        {
         JOptionPane.showInputDialog(null, "Your password is not at least 6 characters long or doesn't contain a special character!!!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
  }