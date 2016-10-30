
public class RowColumnZero {
	
	public static int[][] matrixWithZero(int [][] mat)
	{
		
		String [] row={"false","false","false"};
		String [] column={"false","false","false"};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(mat[i][j] ==0)
				{
					row[i]="true";
					column[j]="true";
				}
				
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(row[i]=="true" || column[j]=="true")
				{
					mat[i][j]=0;
				}
				
			}
		}
		
		
		
		
		
		return mat;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] mat = new int[3][3];
		
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j]=i+j;
				//System.out.println(mat[i][j]);
			}
		}*/
		
		mat[0][0]=0;
		mat[0][1]=1;
		mat[0][2]=2;
		mat[1][0]=0;
		mat[1][1]=2;
		mat[1][2]=3;
		mat[2][0]=4;
		mat[2][1]=5;
		mat[2][2]=6;
		
		int [][]mat1 = matrixWithZero(mat);
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
