import javax.swing.JOptionPane;

public class Rosales_Midterm {

	public static void main(String[] args) {
		 String begin = JOptionPane.showInputDialog("Beginning Number. (INTEGER ONLY)");
		    int Begin = Integer.parseInt(begin);
		    
		    String end = JOptionPane.showInputDialog("End Number. (INTEGER ONLY)");
		    int End = Integer.parseInt(end);
		    
		    String divisor = JOptionPane.showInputDialog("Divisor.(INTEGER ONLY");
		    int Divisor = Integer.parseInt(divisor);
		    
		    if (Begin==End)
		    {
		        JOptionPane.showMessageDialog(null, "Please enter a non equal number.");
		    }
		    else if (Begin>End)
		    {
		        JOptionPane.showMessageDialog(null,"The beginning number must not be greater than the end.");
		    }
		    else
		    {
		        int counternumber = (End - Begin)+1;
		        int sum = 0;
		        for (int i=0;i<counternumber;i++)
		        {
		            int qoutient = Begin%2;
		            if (qoutient==1)
		            {
		                System.out.println(Begin);
		                sum = sum + Begin;
		            }
		            Begin++;
		        }
		        System.out.println("The sum of all Odd Numbers is "+sum);
		        int sum1 = sum % Divisor;
		        if (sum1==0)
		        {
		           JOptionPane.showMessageDialog(null, "The sum of all Odd Numbers from "+begin+" to "+end+" is "+sum+" and is divisible by "+Divisor);
		        }
		        else 
		        {
		            JOptionPane.showMessageDialog(null, "The sum of all Odd Numbers from "+begin+" to "+end+" is "+sum+" and is not divisible by "+Divisor);
		        }
		    }
		    }
		}
