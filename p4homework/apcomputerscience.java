import java.util.ArrayList;
public class apcomputerscience
{
    private ArrayList<Student> myclass = new ArrayList <Student>();
    private String name;
    private String last;
    private double[] grades = new double[5];
    public void addStudent ( Student newStudent )
    {
        myclass.add(newStudent);
    }
    public void dropStudent ( String last )
    {
        for (int i = 0; i < myclass.size(); i++)
        {
            if (last.equals(myclass.get(i).last))
            {
                myclass.remove(myclass.get(i));
            }
        }
    }
    public String toString()
    {
        String output = new String();
        for (Student newStudent : myclass)
        {
            output += newStudent.toString() + "\n";
        }
        return output;
    }
}