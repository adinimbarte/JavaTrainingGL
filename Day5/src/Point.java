
public class Point {
	static int countObj=0;
	public Point(){
	countObj=countObj+1;
	}
	public static void main(String[] args) {
		int num=countObj;
		System.out.println("You created "+num+" objects of the class point");
		for(int i=0;i<10;i++)
		{
			Point p=new Point();
		}

	}

}
