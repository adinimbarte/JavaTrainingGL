package july5;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {2,5,6,3,4,1,9};
		for(int it:arr)
		{
			System.out.print(it+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("\nPrinting array:");
			for(int it:arr)
			{
				System.out.print(it+" ");
			}
		}
		
		
		

	}

}
