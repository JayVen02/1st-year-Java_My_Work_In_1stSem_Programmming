import javax.swing.JOptionPane;

public class Rosales_OddNum {

	public static void main(String[] args) {
		
		int number = 100;
		int a;
		
		System.out.println("Print odd number to " + number);
		  
		  for(a = 1; a <= number; a++)
	      {
	         if(a % 2 == 1)
	         {
	            System.out.print(a + "\n");
	         }
	      }
		  JOptionPane.showMessageDialog(null, "The Odd Numbers from 1 to 100");

	}

	}
