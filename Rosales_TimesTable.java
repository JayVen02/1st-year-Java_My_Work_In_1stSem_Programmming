package Rosales_Switch;

import java.util.Scanner;

public class Rosales_TimesTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number: ");
		int N1 = input.nextInt();
		
        for(int i = 1; i <= 9; i++) {
            System.out.println(N1 + " x " + (i+1) + " = " + (N1 * (i+1)));
           
        }
    }
}

