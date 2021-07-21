package Egg;

import java.util.Scanner;

public class CustomerEgg {
	public void EggNo() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of eggs:");
		int no=sc.nextInt();
		
		int gross=no/144;
		int dozen=(no-(144*gross))/12;
		int piece=no-((144*gross)+(12*dozen));
		
		System.out.println("Your number of eggs is "+gross+"gross, "+dozen+" dozen, and "+piece);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerEgg ce=new CustomerEgg();
		ce.EggNo();

	}

}
