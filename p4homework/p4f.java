import java.util.ArrayList;
public class p4f
{
    public static void main (String args[])
    {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add ("where is my mind");
        songs.add ("luh you");
        songs.add ("come down");
        System.out.println ("number of songs :" + songs.size());
        System.out.println ("names:");
        for (int i =0; i<songs.size(); i++)
        {
            System.out.println (songs .get(i));
        }
    }
}