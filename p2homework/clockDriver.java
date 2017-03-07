import javax.swing.JOptionPane;
public class clockDriver
  {
   public static void main (String args[])
     {
     clock kitchenclock = new clock ();
     clock bedroomclock = new clock (4 , 20, 10);
     JOptionPane.showMessageDialog(null, "Kitchen Clock: " + kitchenclock + "\n" + "Bedroom Clock: " + bedroomclock); 
      /*System.out.println (kitchenclock);
      System.out.println ();
      System.out.println (bedroomclock); */   
     }
  }