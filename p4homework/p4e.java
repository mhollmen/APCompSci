import java.util.ArrayList;
public class p4e
{
    public static void main( String args[] )
    {
        ArrayList<String> schools = new ArrayList<String>();
        schools.add("Princeton");
        schools.add("UCSD");
        schools.add("UCLA");
        schools.add("SDSU");
        schools.add("UCI");
        schools.add("MIT");
        schools.add("Stanford");
        System.out.println( "The size of the ArrayList is: " + schools.size());
        System.out.println("");
        for (String a : schools)
        {
            System.out.println( a );
        }
        for (int i = 0; i < schools.size(); i++)
        {
            if (schools.get(i).length() == 4 )
            {
                schools.remove(i);
                i--;
            }
        }
        System.out.println( "" );
        System.out.println( "The size of the ArrayList is: " + schools.size());
        System.out.println( "" );
        for (String a : schools)
        {
            System.out.println( a );
        }
    }
}
