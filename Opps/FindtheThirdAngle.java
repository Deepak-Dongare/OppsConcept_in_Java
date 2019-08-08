package Opps;

import java.util.Scanner;

public class FindtheThirdAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter of frist angle trangle");
		int a=sc.nextInt();
		System.out.println("Enter of second angle trangle");
		int b=sc.nextInt();
		int c=180-(a+b);
		System.out.println("Thride angle of trangle"+c);

	}

}
