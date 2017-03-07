public class clock
  {
  private int hour;
  private int minute;
  private int second;
  public clock ()
    {
    hour = 00;
    minute = 00;
    second = 00;
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
  public void setTime (int hour, int minute, int second)
    {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }
  public int convertDayLightSavings (int hour)
    {
    this.hour = this.hour + hour;
    return this.hour;
    }
  public int totalSeconds ()
    {
    int hourSec = hour*3600;
    int minuteSec = minute*60;
    int output = hourSec + minuteSec + second;
    return output;
    }
  
  }