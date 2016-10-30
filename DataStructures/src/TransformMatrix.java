/**
 * 
 */

/**
 * @author Arpit
 *
 */
public class TransformMatrix {

	/**
	 * @param args
	 */
	
	public static void Transform(int [][]a)
	{
		int l = a.length;
		//System.out.println(l);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(" "+a[i][j]);
			}
		}
		
		
		int [][]b =new int[3][3];
		for(int i=0;i<l;i++)
		{
			
			for(int j=0;j<l;j++)
			{
				//b[j][l-1-i]=a[i][j];
				b[i][j]=a[l-1-j][i];
					
					
					
				
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]a = new int [3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=3*i+j;
			}
		}
		Transform(a);

	}

}
