import javax.swing.JOptionPane;
public class clockDriver
  {
   public static void main (String args[])
     {
     clock kitchenclock = new clock ();
     clock bedroomclock = new clock (12 , 59, 59);
     JOptionPane.showMessageDialog(null, "Kitchen Clock: " + kitchenclock + "\n" + "Bedroom Clock: " + bedroomclock);    
     }
  }