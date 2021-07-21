package TaxDetails;

import java.util.Scanner;

public class Tax1 {
	

	public static void main(String[] args) {
		int income;
		String gender;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your Gender:");
	gender=sc.nextLine();
	
	System.out.println("Enter your Income:");
	income= sc.nextInt();
	
	if(gender.equals("Male"))
	{
		System.out.println("Your Tax would be:");
		if(income>0 && income<=180000)
		{
			System.out.println("No Tax..!!");
		}
		if(income>180000 && income<=500000)
		{
			System.out.println(income/10);
		}
		if(income>500000 && income<=800000)
		{
			System.out.println(income/20);
		}
		if(income>800000)
		{
			System.out.println(income/30);
		}
	}
	if(gender.equals("Female"))
	{	
		if(income>0 && income<=190000)
		{
			System.out.println("No Tax..!!");
		}
	    if(income>190000 && income<=500000)
	    {
	    	System.out.println(income/10);
	    }
	    if(income>500000 && income<=800000)
	    {
	    	System.out.println(income/20);
	    }
	    if(income>800000)
	    {
	    	System.out.println(income/30);
	    }
	}
	 else
	    {
	    	System.out.println("Invalid Credentials");
	    }
	}
}
