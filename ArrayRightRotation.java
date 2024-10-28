import java.util.Scanner;

public class RightRotation 
{
	public static void main(String[] args)
     {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Size : ");
			int size=sc.nextInt();
			int [] arr=new int[size];
			int itr;
			
			for(itr=0;itr<=size-1;itr++)
				arr[itr]=sc.nextInt();
			
			int k=sc.nextInt();
			for(int x=0;x<k%size;x++)
			{
				int temp=arr[size-1];
				for(int i=size-1;i>=1;i--) 
					arr[i]=arr[i-1];
				
				arr[0]=temp;
		    }
			
			System.out.println("Array Elements");
			for(int i:arr) {
				System.out.print(i+" ");
			}
		}

	}

}
