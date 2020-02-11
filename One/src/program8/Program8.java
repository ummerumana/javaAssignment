package program8;

public class Program8 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int arr[] = {5,10,15,20,25};
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				for(int j=0;j<arr.length;j++)
				{
					if(b==arr[j])
					{
						System.out.println("Its Bingo!!");
						flag=true;
						break;
					}
				}
				break;
			}
		}
		if(flag==false)
			System.out.println("Not Found!!");

	}

}
