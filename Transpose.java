

/**
 *Transpose of Matrix
 * @author asharda
 *
 */
public class Transpose {

	public int[][] transpose(int[][] A) {

		int c[][]=new int[A[0].length][A.length];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				c[j][i]=A[i][j];

			}//end of j
		}//end of i

		return c;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Transpose t=new Transpose();
		int [][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int d[][]=t.transpose(arr);
		for(int i=0;i<d.length;i++)
		{
			System.out.println("");
			for(int j=0;j<d[0].length;j++)
			{
				System.out.print(d[i][j]);
			}
		}
	}

}
