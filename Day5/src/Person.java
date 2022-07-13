
public class Person {
	
	public Person father;
	String name,address;
	public Person son;
	public Person(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public Person youngestPredecessor() {
		Person temp=this;
		if(temp.son==null)
			return temp;
		else
			{
				while(temp.son.son!=null)
				{
					System.out.println(temp.son.name);
					 temp=temp.son;
				 }
				return temp.son;
				}
	}	

	public Person topMostAncestor() {
		Person temp=this;
		if(temp.father==null)
			return this;
		else
		{
			while(temp.father.father!=null)
			{
				System.out.println(temp.father.name);
				temp=temp.father;
			}
		return temp.father;
	}
	}
	public static void main(String[] args) {
		Person[] ar=new Person[10];
		ar[0]=new Person("zero","ngp");
		ar[1]=new Person("first","ngp");
		ar[2]=new Person("second","ngp");
		ar[3]=new Person("third","ngp");
		ar[4]=new Person("four","ngp");
		ar[5]=new Person("fifth","ngp");
		ar[6]=new Person("sixth","ngp");
		ar[7]=new Person("Seventh","ngp");
		ar[8]=new Person("eigth","ngp");
		ar[9]=new Person("ninth","ngp");
		ar[0].son=ar[1];
		ar[0].father=null;
		for(int i=1;i<9;i++)
		{
			ar[i].son=ar[i+1];
			ar[i].father=ar[i-1];
		}
		ar[9].father=ar[8];
		ar[9].son=null;
		
		Person oldest=ar[9].topMostAncestor();
		System.out.println("Oldest= " +oldest.name);
		System.out.println("================");
		Person young = ar[6].youngestPredecessor(); 
		System.out.println("Youngest= "+ young.name);
		
	}
	

}
