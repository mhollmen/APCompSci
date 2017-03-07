public class clockstore
{
    private int [] clocksinstock = new int [3];
    public clockstore ()
    {
        clocksinstock [0] = new clock (1, 2, 40 );
        clocksinstock [1] = new clock (12, 30, 45 );
        clocksinstock [2] = new clock (9, 27, 12);
    }
    public int mostseconds()
    {
        int max = 0;
        for (int i = 0; i<clocksinstock.length; i++)
        {
            if (clocksinstock[i].totalseconds() > max)
            {
                max = i;  
            }
        }
        return max;
    }
    public String toString()
    {
        String output = new String();
        output = "Clock with most seconds: " + mostSeconds() + "\n";
        for (Clock times : clocksinstock)
        {
            output += times + "\n";
        }
    }
}

/*
   _  _  _   __   _  __  ____    _  _  ___
  | || || | /  \ | |/ / |  __|  | || ||  _`\
  | || || || |\ || ' /  | |_  _ | || || |_) |
  | |. .| || || ||  ;   |  _||_|| || ||  __/
  | '   ' ||  _ || . \  | |     | || || |
  |   f   || || || |\ \ | |__   | `' || |
  |__/ \__||_||_||_| \_\|____|   \__/ |_|
      __          _       ___       ___
   ,'`  `'.    .'` `'.   |   |     |   |
  |   .-.  \  /   _   \  |   |     |   |
  |   | |__| |   /_\   | |   |     |   |
  |   |  __  |    _    | |   |     |   |
  |   | |  | |   | |   | |   |____ |   |____
  '   `-'  ' |   | |   | |        ||        |
   `-.__,./  |___| |___| |________||________|
   
                        .-'`'-.
              ,-'`'.   '._     \     ______
             /    .'  ___ `-._  |    \ .-'`
            |   .' ,-' __ `'/.`.'  ___\\
    ______  \ .' \',-' 12 '-.  '.  `-._ \
    '`-. /   ` / / 11    7 1 `.  `.    '.\
       //___  . '10     /    2 \  ;
      / _.-'  | |      O      3|  |  ______
     /.'      | |9      \      '  '  '`-. /
       ______ '  \ 8     \   4/  /      //___
       \ .-'`  '. `'.7  6  5.'  '      / _.-'
     ___\\       `. _ `'''` _.'\\-.   /.'
     `-._ \       .//`''--''   (   )mx
         '.\     (   )          '-`
                  `-' 
 */