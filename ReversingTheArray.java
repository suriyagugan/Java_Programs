import java.util.Scanner;

class ArrayReversing
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter elements of the Array");
        for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Array Elements");
		for(int i:arr) 
			System.out.println(i);
	
		System.out.println("reversing the Array");
		int first,last,temp;
		for(first=0,last=size-1;first<last;first++,last--) 
        {
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
		}
		
		System.out.println("Array Elements");
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
	}

}