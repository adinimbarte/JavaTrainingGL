public class Maxmin {
	public static int[] MaxMin(int x[]) 
	{	
		int mx=x[0];
		int mn=x[0];	
		for(int i=0;i<x.length;i++) 
		{
			if(mx<x[i]) 
				mx=x[i];
			if(mn>x[i])
				mn=x[i];
		}
		int[] res= {mx,mn};
		return res;
	}
	public static void main(String[] args) 
	{		
		int arr[][]= {{10,20,30},{50,60,80,90},{90,10,30,50},{20,40,30,40,60,10},{10,60,70}};
		Maxmin obj=new Maxmin();
		int MaxSum=0,MinSum=0;
		for(int i=0;i<arr.length;i++)
		{
			int[] res=MaxMin(arr[i]);
			MaxSum=MaxSum+res[0];
			MinSum=MinSum+res[1];			
		}
		System.out.println("Maximum sum:"+MaxSum);
		System.out.println("Minimum sum:"+MinSum);
	}

}
