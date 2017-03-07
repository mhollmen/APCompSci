public class carddriver
  {
   public static void main (String args [])
     {
      card card1 = new card ();
      card card2 = new card (1, "Ace", "Spades");
      card card3 = new card (2, "None", "Hearts");
      card[] myHand = new card[10];
      for (int index=0; index<myHand.length; index++)
        {
        System.out.println (myHand[index]);
        }
     }
  }