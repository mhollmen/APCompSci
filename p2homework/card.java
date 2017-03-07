public class card
  {
   private int number;
   private String suit;
   private String face;
   //Cards[] myHand = new Cards[10];
   //Cards card1 = new 
   //Cards( 10, "Jack", "Hearts" ); myHand[0] = card1;
   public card ()
     {
      number = 3;
      suit = new String ("Spades");
      face = new String ("None");
     }
   public card (int number, String suit, String face)
     {
      this.number = number;
      this.suit = suit;
      this.face = face;
     }
   public String toString()
     {
      String output = new String ();
      output = "number: " + number + "\n" +
               "suit: " + suit + "\n" + 
               "face: " + face;
      return output;
     }
  }