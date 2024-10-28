//Rotating the Array on left for n times

import java.util.Scanner;

class ArrayLeftRotation 
{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Size : ");
			int size=sc.nextInt();
			int [] arr=new int[size];
			int itr;
			
			for(itr=0;itr<=size-1;itr++)
				arr[itr]=sc.nextInt();
			
			int k=sc.nextInt();
			for(itr=0;itr<k%size;itr++)
            {
                int temp=arr[0];
                for(int i=0;i<size-1;i++)
                    arr[i]=arr[i+1];
                arr[size-1]=temp;
			}
			
			System.out.println("Array Elements");
			for(int i:arr)
				System.out.print(i+" ");
		}
	}
}