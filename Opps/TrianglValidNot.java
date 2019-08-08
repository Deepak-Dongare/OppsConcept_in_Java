package Opps;

import java.util.Scanner;

public class TrianglValidNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter frist angle");
			int a=sc.nextInt();
			System.out.println("Enter second angle");
			int b=sc.nextInt();
			System.out.println("Enter thride angle");
			int c=sc.nextInt();
			int  sum = a + b + c; 

			if(sum == 180 && a != 0 && b != 0 && c!= 0) {
				System.out.println("Triangle is valid");
			}
			else {
				System.out.println("Triangle is not valid");
			}

	}

}
