class SubSuperClass extends SuperConstructorClass
	{
	SubSuperClass() {
			super();
			System.out.println("Constructor of subclass");
		}
	}
public class SuperConstructorClass {
	SuperConstructorClass(){
		System.out.println("Constructor of parent class");
	}
	

	public static void main(String[] args) {
		SubSuperClass obj=new SubSuperClass();
	}

}
