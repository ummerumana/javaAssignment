package program2;

public class Rectangle {
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		try
		{
		if(length>=0 && length<=20)
		this.length = length;
		else throw new RuntimeException("Enter a valid length");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		try
		{
		if(breadth>=0 && breadth<=20)
		this.breadth = breadth;
		else throw new RuntimeException("Enter a valid breadth");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}


	public double areaOfRectangle()
	{
		return this.length*this.breadth;
	}
	public double peremeterOfRectangle()
	{
		return 2*(this.length+this.breadth);
	}

}
