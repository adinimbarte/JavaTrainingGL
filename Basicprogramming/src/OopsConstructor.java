import java.util.Scanner;

public class OopsConstructor {
	
	int empid,pincode,empdesk;
	String empfname,emplastname,empdesig,locate,employee;
	public OopsConstructor(int empid,String empfname,String employee,String emplastname,String empdesig,int empdesk,String locate, int pincode)
	{
		this.empid=empid;
		this.empfname=empfname;
		this.employee=employee;
		this.emplastname=emplastname;
		this.empdesig=empdesig;
		this.empdesk=empdesk;
		this.locate=locate;
		this.pincode=pincode;
	}
	public void Display()
	{
		System.out.println("\n\t\t -----------Employee Details--------- \t\t\n"+"Emp Id: "+empid+"\n"+"First Name:  "+empfname+"\n"+"Employee : " +employee+" \n"+"Employee Last NAme: "+emplastname+"\n"+"Employee Designation: "+empdesig+"\n"+"Employee Desk: "+empdesk+"\n"+"Employee locate: "+locate+"\n"+"Pincode: "+pincode);
	}


	public static void main(String[] args) {
		int id,desk,pin;
		String fname,lname,designation,locate,employee;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter First Name: ");
		fname=sc.next();
		System.out.println("enter Last Name: ");
		lname=sc.next();
		System.out.println("enter designation: ");
		designation=sc.next();
		System.out.println("enter locate: ");
		locate=sc.next();
		System.out.println("enter Employee :");
		employee=sc.next();
		System.out.println("enter Employee Id:");
		id=sc.nextInt();
		System.out.println("enter Employee desk:");
		desk=sc.nextInt();
		System.out.println("enter Employee pincode:");
		pin=sc.nextInt();
		sc.close();
		OopsConstructor obj=new OopsConstructor(id, fname, employee, lname, designation, desk, locate, pin);
		obj.Display();
		
		
		
	}

}
