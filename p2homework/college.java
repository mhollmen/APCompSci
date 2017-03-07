import java.util.Random;
public class college
  {
  public static void main (String args [])
    {
    String [] college = new String [4];
    college [0] = new String ("Massachusetts Institute of Technology");
    college [1] = new String ("Harvard University");
    college [2] = new String ("Stanford University");
    college [3] = new String ("Yale University");
    int least = college[0].length();
    String shortestcollege = new String();
    for(int index = 0; index<college.length;index++)
      {
      System.out.println(college[index] + " " + college[index].length());
      if (college[index].length()< least)
        {
        least = college[index].length();
        shortestcollege = college[index];
        }
      }
    System.out.println("\n" + "Shortest length is: " + shortestcollege + " " + least + "\n");
    Random generator = new Random();
    int randomIndex = generator.nextInt (college.length);
    college[randomIndex] = null;
    for (int index = 0; index<college.length; index++)
      {
      System.out.println(college[index]);
      }
    }
  }
  /*
   *       _____                   _______                   _____            _____            _____                    _____                    _____          
          /\    \                 /::\    \                 /\    \          /\    \          /\    \                  /\    \                  /\    \         
         /::\    \               /::::\    \               /::\____\        /::\____\        /::\    \                /::\    \                /::\    \        
        /::::\    \             /::::::\    \             /:::/    /       /:::/    /       /::::\    \              /::::\    \              /::::\    \       
       /::::::\    \           /::::::::\    \           /:::/    /       /:::/    /       /::::::\    \            /::::::\    \            /::::::\    \      
      /:::/\:::\    \         /:::/~~\:::\    \         /:::/    /       /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/\:::\    \     
     /:::/  \:::\    \       /:::/    \:::\    \       /:::/    /       /:::/    /       /:::/__\:::\    \        /:::/  \:::\    \        /:::/__\:::\    \    
    /:::/    \:::\    \     /:::/    / \:::\    \     /:::/    /       /:::/    /       /::::\   \:::\    \      /:::/    \:::\    \      /::::\   \:::\    \   
   /:::/    / \:::\    \   /:::/____/   \:::\____\   /:::/    /       /:::/    /       /::::::\   \:::\    \    /:::/    / \:::\    \    /::::::\   \:::\    \  
  /:::/    /   \:::\    \ |:::|    |     |:::|    | /:::/    /       /:::/    /       /:::/\:::\   \:::\    \  /:::/    /   \:::\ ___\  /:::/\:::\   \:::\    \ 
 /:::/____/     \:::\____\|:::|____|     |:::|    |/:::/____/       /:::/____/       /:::/__\:::\   \:::\____\/:::/____/  ___\:::|    |/:::/__\:::\   \:::\____\
 \:::\    \      \::/    / \:::\    \   /:::/    / \:::\    \       \:::\    \       \:::\   \:::\   \::/    /\:::\    \ /\  /:::|____|\:::\   \:::\   \::/    /
  \:::\    \      \/____/   \:::\    \ /:::/    /   \:::\    \       \:::\    \       \:::\   \:::\   \/____/  \:::\    /::\ \::/    /  \:::\   \:::\   \/____/ 
   \:::\    \                \:::\    /:::/    /     \:::\    \       \:::\    \       \:::\   \:::\    \       \:::\   \:::\ \/____/    \:::\   \:::\    \     
    \:::\    \                \:::\__/:::/    /       \:::\    \       \:::\    \       \:::\   \:::\____\       \:::\   \:::\____\       \:::\   \:::\____\    
     \:::\    \                \::::::::/    /         \:::\    \       \:::\    \       \:::\   \::/    /        \:::\  /:::/    /        \:::\   \::/    /    
      \:::\    \                \::::::/    /           \:::\    \       \:::\    \       \:::\   \/____/          \:::\/:::/    /          \:::\   \/____/     
       \:::\    \                \::::/    /             \:::\    \       \:::\    \       \:::\    \               \::::::/    /            \:::\    \         
        \:::\____\                \::/____/               \:::\____\       \:::\____\       \:::\____\               \::::/    /              \:::\____\        
         \::/    /                 ~~                      \::/    /        \::/    /        \::/    /                \::/____/                \::/    /        
          \/____/                                           \/____/          \/____/          \/____/                                           \/____/         
                                                                                                                                                                 
   */