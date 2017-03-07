public class clock
  {
  private int hour;
  private int minute;
  private int second;
  public clock ()
    {
    hour = 3;
    minute = 45;
    second = 16;
    }
  public clock (int hour, int minute, int second)
    {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }
  public String toString()
    {
    String output = new String ();
    output = "the time is " + hour + ":"+  minute + ":"+ second ;
    return output;
    }
  
  }