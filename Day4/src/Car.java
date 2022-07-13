import java.util.Scanner;

public class Car {
	String color, brand, model;
	int year;
	public Car(String color,String brand,String  model,int year)
	{
		this.color=color;
		this.brand=brand;
		this.model=model;
		this.year=year;
		
	}
	public void display()
	{
		System.out.println("Car Details\n" + color+" "+brand+" "+model+" "+year);
	}
	public static void main(String[] args)
	{
		String color,brand,model;
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car color: ");
		color=sc.next();
		System.out.println("Enter car brand: ");
		brand=sc.next();
		System.out.println("Enter car model: ");
		model=sc.next();
		System.out.println("Enter car year: ");
		year=sc.nextInt();
		System.out.println("Car Details\n" + color+brand+model+year);
		sc.close();
		Car cr=new Car(color,brand,model,year);
		
		cr.display();
	}
}
