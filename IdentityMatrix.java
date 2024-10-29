import java.util.Scanner;

class IdntityMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();	
		}
		sc.close();
		System.out.println();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		
		int flag=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j && arr[i][j]!=1)
				{
					flag=1;
					break;
				}
				else if(i!=j && arr[i][j]!=0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}

		if(flag==0)
			System.out.println("Idntical");
		else 
			System.out.println("Not Idntical");
	}
}
