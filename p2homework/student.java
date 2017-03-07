public class student
  {
  private String firstname;
  private String lastname;
  private int age;
  private String favcolor;
  public student ()
    {
    firstname = new String ("Luke");
    lastname = new String ("Vore");
    age = 15;
    favcolor = new String ("Green");
    }
  public student (String firstname, String lastname, int age, String favcolor)
    {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.favcolor = favcolor;
    }
  public String toString()
    {
    String output = new String ();
    output = "\n" + "firstname: " + firstname + "\n"+ 
             "lastname: " + lastname + "\n"+ 
             "age: " + age + "\n"+
             "favcolor: " + favcolor + "\n";
    return output;
    }
  }