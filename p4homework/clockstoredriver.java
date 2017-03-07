import javax.swing.JOptionPane;
public class clockstoredriver
  {
   public static void main (String args[])
     {
     clockstore kitchenclock = new clockstore ();
     clockstore bedroomclock = new clockstore (12 , 59, 59);
     JOptionPane.showMessageDialog(null, "Kitchen Clock: " + kitchenclock + "\n" + "Bedroom Clock: " + bedroomclock);
     }
  }