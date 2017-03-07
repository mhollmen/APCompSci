import javax.swing.JOptionPane;
public class studentdriver
  {
  public static void main (String args[])
    {
    student frosh001= new student("Max", "Hollmen", 4.0, 4.0, 5.0, 3.5, 4.0);
    JOptionPane.showMessageDialog(null, frosh001, "Students", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "GPA value has been set to 4.0", "Students", JOptionPane.INFORMATION_MESSAGE);
    frosh001.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
    JOptionPane.showMessageDialog(null, frosh001, "Students", JOptionPane.INFORMATION_MESSAGE);
    }
  }