package program7;

public class Program7 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.print(a+" "+b+" ");
		for(int i=0;i<13;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
	}

}
