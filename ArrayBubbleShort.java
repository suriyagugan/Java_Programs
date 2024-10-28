import java.util.Scanner;

class BubbleSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println();
		int[] arr=new int[size];

		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();   
		
		int pass,temp,itr;
		for(pass=0;pass<=size-2;pass++)
		{
			for(itr=0;itr<size-1-pass;itr++)
			{
				if(arr[itr]>arr[itr+1]) 
				{
					temp=arr[itr];
					arr[itr]=arr[itr+1];
					arr[itr+1]=temp;
				}
			}
		}
		for(long x:arr) {
			System.out.println(x+" ");
		}
		
	}
}

