import java.util.*;

public class Comparison_Scanner_Rosales {
      
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input First Number: ");
		int n1 = input.nextInt();
		
		System.out.println("Input Second Number: ");
		int  n2 = input.nextInt();
		
		System.out.println("Input Third Number: ");
		int n3 = input.nextInt();		

        if (n1 > n2 && n1 > n3 && n2 > n3)
            System.out.println(n1 + " " + n2 + " " + n3);
        else if (n1 > n2 && n1 > n3)
        	System.out.println(n1 + " " + n3 + " " + n2);

        else if (n2 > n1 && n2 > n3 && n3 > n1) 
            System.out.println(n2 + " " + n3 + " " + n1);
        else if (n2 > n1 && n2 > n3)
        	System.out.println(n2 + " " + n1 + " " + n3);
   
        if (n3 > n1 && n3 > n2 && n1 > n2) 
            System.out.println(n3 + " " + n1 + " " + n2);
            else if (n3 > n1 && n3 > n2)
            	System.out.println(n3 + " " + n2 + " " + n1);

	}

}




