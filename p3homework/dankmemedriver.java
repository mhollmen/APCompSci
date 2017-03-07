import javax.swing.JOptionPane;
public class dankmemedriver
  {
  public static void main (String args[])
    {
    dankmeme frosh001 = new dankmeme ("Max", "Hollmen", 3.75, 4.0, 5.0, 3.5, 4.0);
    dankmeme frosh002 = new dankmeme ("Luke", "Vore", 0.1, 0.001, 0.5, 0.3, 0.2);
    JOptionPane.showMessageDialog(null, frosh001, "Students", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "GPA value has been set to 4.0", "Students", JOptionPane.INFORMATION_MESSAGE);
    frosh001.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
    frosh002.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
    JOptionPane.showMessageDialog(null, frosh001, "Students", JOptionPane.INFORMATION_MESSAGE);
    }
  }