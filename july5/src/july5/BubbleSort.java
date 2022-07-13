package july5;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("----------------Bubble Sort --------------");
		int arr[]= {5,8,2,6,12};
		System.out.println("Printing array:");
		for(int it:arr)
		{
			System.out.print(it+" ");
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("\nPrinting array:");
			for(int it:arr)
			{
				System.out.print(it+" ");
			}
		}
		System.out.println("\n\nPrinting array:");
		for(int it:arr)
		{
			System.out.print(it+" ");
		}

	}

}
