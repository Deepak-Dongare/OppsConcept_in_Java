package Opps;

	import java.util.Scanner;
	public class FahrenheitToCelsius {
	  public static void main(String args[]){
	    System.out.print("Enter the temperature in Fahrenheit: ");
	    Scanner scanner=new Scanner(System.in);
	    float fahrenheit=scanner.nextFloat();
	    float celsius=(fahrenheit-32)*5/9;
	    System.out.println("Temperature in Celsius: "+celsius);
	  }
	}


