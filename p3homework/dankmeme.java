public class dankmeme
  {
  private String firstname = new String();
  private String lastname = new String();
  private double[] grades = new double [5];
  public dankmeme()
    {
    firstname = "Unknown";
    lastname = "Unknown";
    for (int i=0; i<grades.length; i++)
      {
      grades [i] = 0;  
      }
    }
  public dankmeme (String firstname, String lastname, double english, double math, double science, double history, double spanish)
    {
    this.firstname = firstname;
    this.lastname = lastname;
    grades [0] = english;
    grades [1] = math;
    grades [2] = science;
    grades [3] = history;
    grades [4] = spanish;
    }
  public void setGPA (double english, double math, double science, double history, double spanish)
    {
    grades [0] = english;
    grades [1] = math;
    grades [2] = science;
    grades [3] = history;
    grades [4] = spanish;
    }
  public String getGrades()
    {
    if (calcGPA () >=4)
      {
      return "A";  
      }
    if (calcGPA () < 4 && calcGPA() > 3)
      {
      return "B";  
      }
    if (calcGPA () < 3 && calcGPA() > 2)
      {
      return "C";  
      }
    if (calcGPA () < 2 && calcGPA() > 1)
      {
      return "D";  
      }
    if (calcGPA () <1)
      {
      return "F";  
      }
    return "GRADES";
    }
  public double calcGPA()
    {
    double output = 0;
    for (int i=0; i<grades.length; i++)
      {
      output = grades[i] +output;  
      }
    return output/5;
    }
  public String toString()
    {
    String output = new String();
    output = "First name: " + firstname + "\n" + 
             "Last name: " + lastname + "\n" + 
             "Average GPA: " + calcGPA();
             return output;
    }
  }