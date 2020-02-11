package program12;

public class Program12 {
	public static void main(String[] args) {
		Complex c1 = new Complex(10, 7);
		Complex c2 = new Complex(3, 4);
		
		Complex add = Complex.addition(c1,c2);
		Complex sub = Complex.subtraction(c1,c2);
		
		System.out.println("Addition of    :  "+c1.display()+" & "+c2.display()+" = "+add.display());
		System.out.println("Subtraction of :  "+c1.display()+" & "+c2.display()+" = "+sub.display());
		
	}

}
