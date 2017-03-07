import javax.swing.JOptionPane;
public class collegeround2
  {
  public static void main (String args [])
    {
    String school1 = new String ( "Stanford University" );
    String school2 = new String ( "Harvard University" );
    String school3 = new String ( "Massachusetts Institute of Technology" );
    
    
    JOptionPane.showMessageDialog(null, school1.compareToIgnoreCase(school2) + "\n" + school2.compareToIgnoreCase(school3));
   }
  }
  
  /*
   * A. The compareTo method is gettttting the distance bewteen the first letter os second string and the the firsrt letter of the first string.
   * B.when the first letters of both are the same of co compares the distance between the second letters in both strings
UUUUUUUU     UUUUUUUUNNNNNNNN        NNNNNNNNIIIIIIIIIIVVVVVVVV           VVVVVVVVEEEEEEEEEEEEEEEEEEEEEERRRRRRRRRRRRRRRRR      SSSSSSSSSSSSSSS IIIIIIIIIITTTTTTTTTTTTTTTTTTTTTTTYYYYYYY       YYYYYYY
U::::::U     U::::::UN:::::::N       N::::::NI::::::::IV::::::V           V::::::VE::::::::::::::::::::ER::::::::::::::::R   SS:::::::::::::::SI::::::::IT:::::::::::::::::::::TY:::::Y       Y:::::Y
U::::::U     U::::::UN::::::::N      N::::::NI::::::::IV::::::V           V::::::VE::::::::::::::::::::ER::::::RRRRRR:::::R S:::::SSSSSS::::::SI::::::::IT:::::::::::::::::::::TY:::::Y       Y:::::Y
UU:::::U     U:::::UUN:::::::::N     N::::::NII::::::IIV::::::V           V::::::VEE::::::EEEEEEEEE::::ERR:::::R     R:::::RS:::::S     SSSSSSSII::::::IIT:::::TT:::::::TT:::::TY::::::Y     Y::::::Y
 U:::::U     U:::::U N::::::::::N    N::::::N  I::::I   V:::::V           V:::::V   E:::::E       EEEEEE  R::::R     R:::::RS:::::S              I::::I  TTTTTT  T:::::T  TTTTTTYYY:::::Y   Y:::::YYY
 U:::::D     D:::::U N:::::::::::N   N::::::N  I::::I    V:::::V         V:::::V    E:::::E               R::::R     R:::::RS:::::S              I::::I          T:::::T           Y:::::Y Y:::::Y   
 U:::::D     D:::::U N:::::::N::::N  N::::::N  I::::I     V:::::V       V:::::V     E::::::EEEEEEEEEE     R::::RRRRRR:::::R  S::::SSSS           I::::I          T:::::T            Y:::::Y:::::Y    
 U:::::D     D:::::U N::::::N N::::N N::::::N  I::::I      V:::::V     V:::::V      E:::::::::::::::E     R:::::::::::::RR    SS::::::SSSSS      I::::I          T:::::T             Y:::::::::Y     
 U:::::D     D:::::U N::::::N  N::::N:::::::N  I::::I       V:::::V   V:::::V       E:::::::::::::::E     R::::RRRRRR:::::R     SSS::::::::SS    I::::I          T:::::T              Y:::::::Y      
 U:::::D     D:::::U N::::::N   N:::::::::::N  I::::I        V:::::V V:::::V        E::::::EEEEEEEEEE     R::::R     R:::::R       SSSSSS::::S   I::::I          T:::::T               Y:::::Y       
 U:::::D     D:::::U N::::::N    N::::::::::N  I::::I         V:::::V:::::V         E:::::E               R::::R     R:::::R            S:::::S  I::::I          T:::::T               Y:::::Y       
 U::::::U   U::::::U N::::::N     N:::::::::N  I::::I          V:::::::::V          E:::::E       EEEEEE  R::::R     R:::::R            S:::::S  I::::I          T:::::T               Y:::::Y       
 U:::::::UUU:::::::U N::::::N      N::::::::NII::::::II         V:::::::V         EE::::::EEEEEEEE:::::ERR:::::R     R:::::RSSSSSSS     S:::::SII::::::II      TT:::::::TT             Y:::::Y       
  UU:::::::::::::UU  N::::::N       N:::::::NI::::::::I          V:::::V          E::::::::::::::::::::ER::::::R     R:::::RS::::::SSSSSS:::::SI::::::::I      T:::::::::T          YYYY:::::YYYY    
    UU:::::::::UU    N::::::N        N::::::NI::::::::I           V:::V           E::::::::::::::::::::ER::::::R     R:::::RS:::::::::::::::SS I::::::::I      T:::::::::T          Y:::::::::::Y    
      UUUUUUUUU      NNNNNNNN         NNNNNNNIIIIIIIIII            VVV            EEEEEEEEEEEEEEEEEEEEEERRRRRRRR     RRRRRRR SSSSSSSSSSSSSSS   IIIIIIIIII      TTTTTTTTTTT          YYYYYYYYYYYYY                                                                                                                                                                                                                                                                                  
   */