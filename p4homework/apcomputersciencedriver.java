public class apcomputersciencedriver
{
    public static void main (String args[])
    {
        apcomputerscience apCompSci = new p4g ();
        apCompSci.addStudent(new Student("Luke", "Vore", 4.0, 1.0, 2.0, 3.0, 3.5));
        apCompSci.addStudent(new Student("Ashley", "Dead",4.0, 4.0, 4.0, 3.5, 2.0));
        apCompSci.addStudent(new Student("Milla", "Hollman", 4.0, 3.0, 2.5, 3.25, 1.0));
        System.out.println(apCompSci);
        apCompSci.dropStudent("Vore");
        System.out.print(apCompSci);
    }
}
