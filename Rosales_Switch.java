import java.util.*;
public class Rosales_Switch {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
         System.out.println("Enter Age");
         int user_age = sc.nextInt();
        
        
 switch (user_age) {
     case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
         System.out.println(user_age + " is within 0 to 10");
         break;
        
     case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
         System.out.println(user_age + " is within 11 to 20");
         break;
     case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30:
         System.out.println(user_age + " is within 21 to 30");
                break;
     default:
         System.out.println(" your age is above 30");
   
}      
       


}
}

