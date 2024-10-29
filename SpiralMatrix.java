import java.util.Scanner;

class SpiralMatrix {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				mat[i][j]=sc.nextInt();
		}
		
		sc.close();
		
		int top=0, bottom=row-1, left=0, right=col-1;
		
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<=right;i++)
				System.out.print(mat[top][i]+" ");
			top++;
			
			for(int i=top;i<=bottom;i++)
				System.out.print(mat[i][bottom]+" ");
			right--;
			
			if(top<=bottom)
			{
				for(int i=right;i>=left;i--)
					System.out.print(mat[bottom][i]+" ");
			}
			bottom--;
			
			if(left<=right)
			{
				for(int i=bottom;i>=top;i--)
					System.out.print(mat[i][left]+" ");
			}
			left++;
		}
	}
}
