public class P3i_am_a_g
{
    public static void main (String [] args)
    {
        int [] nums = {-9, 2, 3, 4, 7, 9, 10, 23, 45, 67}; 
        int find = 9; 
        for (int index = 0; index < nums.length; index++)
        {
            if(nums[index] == find)
            {
                System.out.println(" " + find + " is in index " + index + "\n");
            }
            else
            {
                System.out.println(" -1 " + "\n");    
            }
        }
    }
}
/*
/$$$$$$         /$$$$$$         /$$$$$$        /$$   /$$       /$$$$$$$$        /$$$$$$          /$$    /$$$$$$         /$$$$$$   /$$$$$$        /$$   /$$ /$$$$$$$         /$$$$$$  /$$$$$$$$
/$$__  $$       /$$__  $$       /$$__  $$      | $$  | $$      |_____ $$/       /$$__  $$       /$$$$   /$$$_  $$       /$$__  $$ /$$__  $$      | $$  | $$| $$____/        /$$__  $$|_____ $$/
| $$  \ $$      |__/  \ $$      |__/  \ $$      | $$  | $$           /$$/       | $$  \ $$      |_  $$  | $$$$\ $$      |__/  \ $$|__/  \ $$      | $$  | $$| $$            | $$  \__/     /$$/ 
/$$$$$$|  $$$$$$$        /$$$$$$/         /$$$$$/      | $$$$$$$$          /$$/        |  $$$$$$$        | $$  | $$ $$ $$        /$$$$$$/   /$$$$$/      | $$$$$$$$| $$$$$$$       | $$$$$$$     /$$/  
|______/ \____  $$       /$$____/         |___  $$      |_____  $$         /$$/          \____  $$        | $$  | $$\ $$$$       /$$____/   |___  $$      |_____  $$|_____  $$      | $$__  $$   /$$/   
/$$  \ $$      | $$             /$$  \ $$            | $$        /$$/           /$$  \ $$        | $$  | $$ \ $$$      | $$       /$$  \ $$            | $$ /$$  \ $$      | $$  \ $$  /$$/    
|  $$$$$$/      | $$$$$$$$      |  $$$$$$/            | $$       /$$/           |  $$$$$$/       /$$$$$$|  $$$$$$/      | $$$$$$$$|  $$$$$$/            | $$|  $$$$$$/      |  $$$$$$/ /$$/     
\______/       |________/       \______/             |__/      |__/             \______/       |______/ \______/       |________/ \______/             |__/ \______/        \______/ |__/      

                                                                                                                                                                                                        
 */