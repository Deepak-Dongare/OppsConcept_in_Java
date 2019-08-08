package Opps;

import java.util.Scanner;

public class ConvertItIntoMeterNKilometre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter centimetre ");
		int a=sc.nextInt();
		  
		int m=a/100;
		System.out.println(m);
		int km=a/1000;
		System.out.println(km);

	}
}

