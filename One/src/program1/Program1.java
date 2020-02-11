package program1;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int i=0;
		while(i<n)
		{
			System.out.println(i+2+" ");
			i+=2;
		}
	}
}
