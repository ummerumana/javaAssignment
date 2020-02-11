package program5;

import java.util.ArrayList;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		System.out.println("enter number of employee");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Employee "+(i+1));
			System.out.println("Id");int eId=sc.nextInt();sc.nextLine();
			System.out.println("name");String eName=sc.nextLine();
			System.out.println("joining:\ndate");int d=sc.nextInt();
			System.out.println("month");int m=sc.nextInt();
			System.out.println("year");int y=sc.nextInt();
			
			emp.add(new Employee(eId, eName, d, m, y));
		}
		
		System.out.println("Employee details are :\n-----------------------------------------------");
		System.out.println("Id\tName\tJoining\n----------------------------------------------");
		for(int i=0;i<emp.size();i++)
		{
			System.out.println(emp.get(i).geteId()+"\t"+emp.get(i).geteName()+"\t"+emp.get(i).getDate());
		}
	}

}
