package Opps;

import java.util.Scanner;

public class triangl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side1 ");
		int side1=sc.nextInt();
				System.out.println("Enter side2 ");
		int side2=sc.nextInt();
		System.out.println("Enter side3 ");
		int side3=sc.nextInt();

		if((side1 + side2) > side3)
	    {
	        if((side2 + side3) > side1)
	        {
	            if((side1 + side3) > side2) 
	            {
	                /*
	                 * If side1 + side2 > side3 and
	                 *    side2 + side3 > side1 and
	                 *    side1 + side3 > side2 then
	                 * the triangle is valid.
	                 */
	                System.out.println("Triangle is valid.");
	            }
	            else
	            {
	                System.out.println("Triangle is not valid.");
	            }
	        }
	        else
	        {
	            System.out.println("Triangle is not valid.");
	        }
	    }
	    else
	    {
	        System.out.println("Triangle is not valid.");
	    }

	}

}
