
class Car
{
	String car_name,brand;
	int car_id,car_model,mfg_year;
	public Car(String car_name, int car_id, int car_model, String brand, int mfg_year) 
	{
		this.car_name=car_name;
		this.car_id=car_id;
		this.car_model=car_model;
		this.brand=brand;
		this.mfg_year=mfg_year;
	}
	
}
class Buyer extends Car
{
	String customer_name;
	Buyer(String name,String car_name,int car_id,int car_model,String brand,int mfg_year)
	{
		super(car_name,car_id,car_model,brand,mfg_year); 
		this.customer_name=name;
	}

}
public class Association 
{

	public static void main(String[] args) 
	{
		Buyer object =new Buyer("aditi nimbarte", "Audi r8", 1234, 2022, "Audi", 2022);
		System.out.println(object.customer_name);
		System.out.println(object.car_model);
		System.out.println(object.brand);

	}

}
