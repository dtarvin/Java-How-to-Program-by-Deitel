// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import javax.swing.JOptionPane;

public class Addition
{
  // main method begins execution of Java application
  public static void main( String[] args )
  {
    String number1 = JOptionPane.showInputDialog("Enter first integer");
    String number2 = JOptionPane.showInputDialog("Enter second integer");
    String sum = parseInt(number1) + parseInt(number2);
    String message = String.format( "Sum is %d", sum );
    JOptionPane.showMessageDialog( null, message );
  }
}
