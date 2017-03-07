import javax.swing.JOptionPane;
public class Login
{
    public static void main (String args[])
    {
        String username = "max";
        String password = "password*";
        int attempts = 0;
        while (attempts < 4)
        {
            String usernameinput = JOptionPane.showInputDialog("Username");
            String passwordinput = JOptionPane.showInputDialog("Password");
            if(usernameinput.equals(username)&& passwordinput.equals(password))
            {
                JOptionPane.showMessageDialog(null, "WELCome");
                System.exit(0);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "incoRRect PlEasE TrY AgaiN");
                attempts++;
                if ( attempts > 3)
                {
                    JOptionPane.showMessageDialog(null, "TOOoOOOOoooOOOo MAny TrIes SuCker");
                    System.exit(0);
                }
            }
        }
    }
}