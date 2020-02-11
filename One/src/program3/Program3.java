package program3;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books ");
		Book b = new Book();
		
		b.createBooks(sc.nextInt());
		b.showBooks();
		
		sc.close();

	}

}
